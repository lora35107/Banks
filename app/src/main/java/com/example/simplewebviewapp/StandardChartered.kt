package com.example.simplewebviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class StandardChartered : AppCompatActivity() {
    lateinit var standardwebview :WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_standard_chartered)
        standardwebview = findViewById(R.id.webiew_standard)
        val websettings = standardwebview.settings
        websettings.javaScriptEnabled = true
        standardwebview.loadUrl("https://www.sc.com/ke/" )
    }
}