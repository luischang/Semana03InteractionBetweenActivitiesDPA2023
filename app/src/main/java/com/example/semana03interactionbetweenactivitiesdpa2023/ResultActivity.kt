package com.example.semana03interactionbetweenactivitiesdpa2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val message = intent.getStringExtra("param")
        val tvResult: TextView = findViewById(R.id.tvResult)
        val btnBack: Button = findViewById(R.id.btnBack)

        tvResult.text = message

        btnBack.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}