package com.example.mycicdapp.data.repository

import com.example.mycicdapp.business.UserModel
import com.example.mycicdapp.business.UserRepository
import com.example.mycicdapp.data.UserEntity
import com.example.mycicdapp.data.repository.database.UserDao
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(private val userDao: UserDao): UserRepository {
    override suspend fun createUser(userModel: UserModel) {
        val userEntity = UserEntity(
            userModel.name,
            userModel.email,
            userModel.address
        )
        userDao.createUser(userEntity)
    }

    override suspend fun getUserById(userId: Int): UserModel {
       val user = userDao.getUserById(userId)
        return UserModel(user.userId!!, user.name, user.email, user.address)
    }

    override suspend fun getUsers(): List<UserModel> {
        return userDao.getUsers().map {
            UserModel(it.userId!!, it.name, it.email, it.address)
        }
    }
}