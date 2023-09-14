package com.example.semana03interactionbetweenactivitiesdpa2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etMessage: EditText = findViewById(R.id.etMessage)
        val btnSend: Button = findViewById(R.id.btnSend)

        btnSend.setOnClickListener{
            val messageValue = etMessage.text.toString()
            sendMessage(messageValue)
        }
    }

    private fun sendMessage(message:String)
    {
        val intent = Intent(this,ResultActivity::class.java)
        intent.putExtra("param",message)
        startActivity(intent)
    }

}