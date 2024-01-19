package com.example.part2inclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.util.Log
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //find button from activity_main.xml
        val button = findViewById<Button>(R.id.button)
        //set a listener for the button:
        button.setOnClickListener {
            Log.v("MainActivity", "Button Clicked")
            Toast.makeText(this, "Hello to you too!", Toast.LENGTH_SHORT).show()
        }

    }
}