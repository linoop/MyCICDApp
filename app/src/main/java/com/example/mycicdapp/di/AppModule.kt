package com.example.mycicdapp.di

import android.content.Context
import androidx.room.Room
import com.example.mycicdapp.storage.MyDao
import com.example.mycicdapp.storage.MyDatabase
import com.example.mycicdapp.utils.Constants.MY_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideMyDao(@ApplicationContext app: Context): MyDao =
        Room.databaseBuilder(app, MyDatabase::class.java, MY_DATABASE_NAME).build().getDao()

}