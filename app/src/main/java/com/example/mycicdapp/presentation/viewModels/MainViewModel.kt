package com.example.mycicdapp.presentation.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mycicdapp.business.UserModel
import com.example.mycicdapp.business.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val userRepository: UserRepository): ViewModel() {
    fun createUser(userModel: UserModel) = viewModelScope.launch(Dispatchers.IO) {
        userRepository.createUser(userModel)
    }
}