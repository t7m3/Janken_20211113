package com.example.janken_20211113

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.janken_20211113.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    val gu = 0
    val choki = 1
    val pa = 2


    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val id = intent.getIntExtra("MY_HAND", 0)

        when(id){
            R.id.gu -> binding.myHandImage.setImageResource(R.drawable.gu)
            R.id.choki -> binding.myHandImage.setImageResource(R.drawable.choki)
            R.id.pa -> binding.myHandImage.setImageResource(R.drawable.pa)

            //else -> binding.myHandImage.setImageResource(R.drawable.pa)
        }

        // コンピュータの手を決める
        val  comHand = (Math.random() * 3).toInt()
        when (comHand) {
            gu -> binding.comHandImage.setImageResource(R.drawable.com_gu)
            choki -> binding.comHandImage.setImageResource(R.drawable.com_choki)
            pa -> binding.comHandImage.setImageResource(R.drawable.com_pa)
        }

        binding.backButton.setOnClickListener{finish()}
    }
}