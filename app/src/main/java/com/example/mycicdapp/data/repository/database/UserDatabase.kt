package com.example.mycicdapp.data.repository.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mycicdapp.data.UserEntity

@Database(entities = [UserEntity::class], version = 1, exportSchema = true)
abstract class UserDatabase : RoomDatabase(){
    abstract fun getDao(): UserDao
}