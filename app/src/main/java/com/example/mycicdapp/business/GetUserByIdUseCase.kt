package com.example.mycicdapp.business

import javax.inject.Inject

class GetUserByIdUseCase @Inject constructor(private val userRepository: UserRepository) {

    suspend fun execute(userId: Int) = userRepository.getUserById(userId)

}