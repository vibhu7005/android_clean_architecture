package com.example.android_clean_architecture.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_clean_architecture.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}