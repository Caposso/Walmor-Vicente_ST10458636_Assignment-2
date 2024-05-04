package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declare the Variable
        val button = findViewById<Button>(R.id.button)
        // Set button On Click Listener. When clicked is going to lead us to the other page
        button.setOnClickListener {
            // Create the explicit intent
            val intent = Intent(this, Game::class.java)
            // Start Activity
            startActivity(intent)
        }
    }
}