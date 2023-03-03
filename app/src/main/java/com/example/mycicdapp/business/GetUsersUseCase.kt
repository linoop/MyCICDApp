package com.example.mycicdapp.business

import javax.inject.Inject

class GetUsersUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend fun invoke(): List<UserModel> {
        return userRepository.getUsers()
    }
}