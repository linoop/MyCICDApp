package com.example.mycicdapp.storage

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [], version = 1, exportSchema = true)
abstract class MyDatabase : RoomDatabase(){
    abstract fun getDao(): MyDao
}