package com.example.mycicdapp.business

import javax.inject.Inject

class CreateUserUseCase @Inject constructor(private val userRepository: UserRepository) {

    suspend fun invoke(userModel: UserModel) = userRepository.createUser(userModel)
}