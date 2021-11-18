package com.example.janken_20211113

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.janken_20211113.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener{finish()}
    }
}