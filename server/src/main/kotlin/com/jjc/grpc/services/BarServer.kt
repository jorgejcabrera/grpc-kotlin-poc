package com.jjc.grpc.services

import com.google.protobuf.Timestamp
import com.jjc.grpc.services.PaymentStatus.*
import io.grpc.Server
import io.grpc.ServerBuilder
import java.time.Instant
import java.util.*


class BarServer(private val port: Int) {

    private val userRepository = UserRepositoryAdapter()
    private val server: Server = ServerBuilder
        .forPort(port)
        .addService(HyptoBarService())
        .addService(UserGrpcService(userRepository))
        .build()

    fun start() {
        server.start()
        println("Server started, listening on $port")
        Runtime.getRuntime().addShutdownHook(
            Thread {
                println("*** shutting down gRPC server since JVM is shutting down")
                this@BarServer.stop()
                println("*** server shut down")
            }
        )
    }

    private fun stop() {
        server.shutdown()
    }

    fun blockUntilShutdown() {
        server.awaitTermination()
    }

    private class UserGrpcService(private val userRepository: UserRepository) : UserGrpcKt.UserCoroutineImplBase() {
        override suspend fun findById(request: FindUserRequest): UserResponse {
            return userRepository.findById(request.userId).asDto()
        }
    }

    private class HyptoBarService : BarGrpcKt.BarCoroutineImplBase() {

        val processedOrders = mutableMapOf<Bill, PaymentStatus>()

        val drinkContainers = mapOf(
            DrinkType.WHISKY to ContainerType.GLASS,
            DrinkType.RUM to ContainerType.GLASS,
            DrinkType.VODKA to ContainerType.GLASS,
            DrinkType.GIN to ContainerType.GLASS,
            DrinkType.WINE to ContainerType.CHALICE,
            DrinkType.BEER to ContainerType.JUG
        )

        fun Drink.getOrderAmount(): Long = when (this.type) {
            DrinkType.BEER -> 100
            DrinkType.VODKA -> 150
            DrinkType.RUM -> 50
            DrinkType.WHISKY -> 300
            DrinkType.GIN -> 200
            DrinkType.WINE -> 250
            else -> throw Exception("Bad Request: Unsupported drink type")
        }

        fun Drink.pour(): Container = run {
            Container.newBuilder()
                .setContainerId(UUID.randomUUID().toString())
                .setDrink(this)
                .setType(drinkContainers[this.type])
                .build()
        }

        fun Long.generateBill(): Bill {
            val orderId = UUID.randomUUID().toString()
            val time = Instant.now()
            val currTimestamp = Timestamp.newBuilder()
                .setSeconds(time.epochSecond)
                .setNanos(time.nano)
                .build()

            val currentBill = Bill.newBuilder()
                .setOrderId(orderId)
                .setOrderAmount(this)
                .setOrderTimestamp(currTimestamp)
                .build()

            processedOrders[currentBill] = PENDING
            return currentBill
        }

        override suspend fun orderDrink(request: DrinkRequest): DrinkResponse {
            println("Requested order:\n$request")

            val container = request.drink.pour()
            println("Poured drink onto container:\n $container")

            val bill = request.drink.getOrderAmount().generateBill()
            println("Generated bill:\n$bill")

            println()
            return DrinkResponse.newBuilder()
                .setBill(bill)
                .setContainer(container)
                .build()
        }

        override suspend fun orderMultipleDrinks(request: DrinksRequest): DrinksResponse {
            println("Requested order:\n$request")
            var orderAmount: Long = 0
            val containers = request.drinksList.map {
                orderAmount += it.getOrderAmount()
                it.pour()
            }

            return DrinksResponse.newBuilder()
                .setBill(orderAmount.generateBill())
                .addAllContainers(containers)
                .build()
        }

        override suspend fun payBill(request: PaymentRequest): PaymentResponse {
            return when (processedOrders[request.bill]) {
                PENDING, FAILED -> {
                    if (request.bill.orderAmount > request.paymentAmount) {
                        processedOrders[request.bill] = FAILED
                        PaymentResponse.newBuilder()
                            .setBalanceAmount(request.paymentAmount)
                            .setStatus(FAILED)
                            .setReason("Bill amount is ${request.bill.orderAmount} but you have only paid ${request.paymentAmount}")
                            .build()
                    } else {
                        processedOrders.remove(request.bill)
                        PaymentResponse.newBuilder()
                            .setBalanceAmount(request.paymentAmount - request.bill.orderAmount)
                            .setStatus(PAID)
                            .setReason("Bill paid successfully!!")
                            .build()
                    }
                }
                else -> {
                    if (processedOrders.contains(request.bill)) {
                        processedOrders.remove(request.bill)
                    }
                    PaymentResponse.newBuilder()
                        .setBalanceAmount(request.paymentAmount)
                        .setStatus(FAILED)
                        .setReason("Bill with id=${request.bill.orderId} not found! Either it was never created or it was already paid!!")
                        .build()
                }
            }
        }
    }
}

fun main() {
    val port = System.getenv("PORT")?.toInt() ?: 50051
    val server = BarServer(port)
    server.start()
    server.blockUntilShutdown()
}
