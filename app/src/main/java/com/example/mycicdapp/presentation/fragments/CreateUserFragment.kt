package com.example.mycicdapp.presentation.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.mycicdapp.R
import com.example.mycicdapp.databinding.FragementCreateUserBinding

class CreateUserFragment:Fragment(R.layout.fragement_create_user) {
    private lateinit var binding: FragementCreateUserBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragementCreateUserBinding.bind(view)
    }
}