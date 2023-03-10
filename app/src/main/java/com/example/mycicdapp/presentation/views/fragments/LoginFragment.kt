package com.example.mycicdapp.presentation.views.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mycicdapp.R
import com.example.mycicdapp.databinding.FragementLoginBinding

class LoginFragment:Fragment(R.layout.fragement_login) {
    private lateinit var binding: FragementLoginBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragementLoginBinding.bind(view)
        setupFragment()
    }

    private fun setupFragment() {
        binding.gotoCreateUser.setOnClickListener {
            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToCreateUserFragment())
        }
    }
}