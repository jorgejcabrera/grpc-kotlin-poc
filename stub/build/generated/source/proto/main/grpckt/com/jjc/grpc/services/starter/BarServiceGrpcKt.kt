package com.jjc.grpc.services.starter

import com.jjc.grpc.services.starter.BarGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for barservice.Bar.
 */
object BarGrpcKt {
  const val SERVICE_NAME: String = BarGrpc.SERVICE_NAME

  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = BarGrpc.getServiceDescriptor()

  val orderDrinkMethod: MethodDescriptor<DrinkRequest, DrinkResponse>
    @JvmStatic
    get() = BarGrpc.getOrderDrinkMethod()

  val orderMultipleDrinksMethod: MethodDescriptor<DrinksRequest, DrinksResponse>
    @JvmStatic
    get() = BarGrpc.getOrderMultipleDrinksMethod()

  val payBillMethod: MethodDescriptor<PaymentRequest, PaymentResponse>
    @JvmStatic
    get() = BarGrpc.getPayBillMethod()

  /**
   * A stub for issuing RPCs to a(n) barservice.Bar service as suspending coroutines.
   */
  @StubFor(BarGrpc::class)
  class BarCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<BarCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): BarCoroutineStub =
        BarCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun orderDrink(request: DrinkRequest): DrinkResponse = unaryRpc(
      channel,
      BarGrpc.getOrderDrinkMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun orderMultipleDrinks(request: DrinksRequest): DrinksResponse = unaryRpc(
      channel,
      BarGrpc.getOrderMultipleDrinksMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun payBill(request: PaymentRequest): PaymentResponse = unaryRpc(
      channel,
      BarGrpc.getPayBillMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the barservice.Bar service based on Kotlin coroutines.
   */
  abstract class BarCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for barservice.Bar.orderDrink.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun orderDrink(request: DrinkRequest): DrinkResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method barservice.Bar.orderDrink is unimplemented"))

    /**
     * Returns the response to an RPC for barservice.Bar.orderMultipleDrinks.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun orderMultipleDrinks(request: DrinksRequest): DrinksResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method barservice.Bar.orderMultipleDrinks is unimplemented"))

    /**
     * Returns the response to an RPC for barservice.Bar.payBill.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun payBill(request: PaymentRequest): PaymentResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method barservice.Bar.payBill is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BarGrpc.getOrderDrinkMethod(),
      implementation = ::orderDrink
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BarGrpc.getOrderMultipleDrinksMethod(),
      implementation = ::orderMultipleDrinks
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BarGrpc.getPayBillMethod(),
      implementation = ::payBill
    )).build()
  }
}
