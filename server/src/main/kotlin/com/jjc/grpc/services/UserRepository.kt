package com.jjc.grpc.services

interface UserRepository {
    fun findById(id: Long): User
}

class UserRepositoryAdapter : UserRepository {
    override fun findById(id: Long): User {
        return User(firstName = "Jorge", lastName = "Cabrera", id = 1)
    }
}

data class User(
    private val firstName: String,
    private val lastName: String,
    private val id: Long
) {
    fun asDto(): UserResponse {
        val publicUserAccount = PublicUserAccount.newBuilder()
            .setUserId(id)
            .setFirstName(firstName)
            .setLastName(lastName)
            .build()
        return UserResponse
            .newBuilder()
            .setPublicUser(publicUserAccount)
            .build()
    }
}
