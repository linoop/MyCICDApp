package com.example.mycicdapp.data.repository.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mycicdapp.data.UserEntity
import com.example.mycicdapp.utils.Constants.USER_TABLE

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun createUser(userModel: UserEntity):Long

    @Query("SELECT * FROM $USER_TABLE WHERE user_id == :userId")
    fun getUserById(userId:Int):UserEntity

    @Query("SELECT * FROM $USER_TABLE")
    fun getUsers():List<UserEntity>
}