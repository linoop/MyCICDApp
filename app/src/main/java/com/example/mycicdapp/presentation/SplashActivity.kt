package com.example.mycicdapp.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mycicdapp.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myButton.setOnClickListener { buttonOnClick() }
    }

    private fun buttonOnClick() {
        binding.myTextView.text = "Clicked"
    }
}