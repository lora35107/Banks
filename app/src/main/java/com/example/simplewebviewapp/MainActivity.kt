package com.example.simplewebviewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var StandardButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        StandardButton = findViewById(R.id.btn_standard)

        StandardButton.setOnClickListener {
            val gotostandard = Intent(this, StandardChartered::class.java)
            startActivity(gotostandard)

        }
    }
}