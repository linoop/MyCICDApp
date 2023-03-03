package com.example.mycicdapp.di

import android.content.Context
import androidx.room.Room
import com.example.mycicdapp.business.UserRepository
import com.example.mycicdapp.data.repository.UserRepositoryImpl
import com.example.mycicdapp.data.repository.database.UserDao
import com.example.mycicdapp.data.repository.database.UserDatabase
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
    fun provideMyDao(@ApplicationContext app: Context): UserDao =
        Room.databaseBuilder(app, UserDatabase::class.java, MY_DATABASE_NAME).build().getDao()

    @Singleton
    @Provides
    fun provideUserRepository(userDao: UserDao): UserRepository = UserRepositoryImpl(userDao)

}