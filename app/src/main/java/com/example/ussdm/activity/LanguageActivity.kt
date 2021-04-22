package com.example.ussdm.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.ussdm.R
import com.example.ussdm.databinding.ActivityLanguageBinding

class LanguageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLanguageBinding
    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLanguageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        button = findViewById(R.id.uzbekLotin)
//        binding.uzbekLotin.setOnClickListener {
////            startActivity(Intent(this@LanguageActivity, MainActivity::class.java))
////            finish()
////        }

        button.setOnClickListener {
            startActivity(Intent(this@LanguageActivity, MainActivity::class.java))
          finish()
        }
    }
}