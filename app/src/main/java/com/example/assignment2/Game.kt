package com.example.assignment2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Game : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        // Assign numbers to the Texts so I can use it on If Statements
        var textEat = 0
        var textBath = 0
        var textContent = 0

        // Declaring the Variables
        val textHunger = findViewById<TextView>(R.id.textHunger)
        val textClean = findViewById<TextView>(R.id.textClean)
        val textHappy = findViewById<TextView>(R.id.textHappy)
        val image = findViewById<ImageView>(R.id.imageView2)
        val feed = findViewById<Button>(R.id.feedButton)
        val clean = findViewById<Button>(R.id.cleanButton)
        val play = findViewById<Button>(R.id.playButton)

        // Calling the Variable "Feed" which is a button, set it on Click Listener. Using if statements to put a range on the status and increase the status by one
        // Connecting a drawable to the button, when clicked is going to change to the designated image
        feed.setOnClickListener {
            if (textEat < 10) {
                textEat++
            }
            image.setImageResource(R.drawable.feed)
            textHunger.text = textEat.toString()
        }

        // Calling the Variable "Clean" which is a button, set it on Click Listener. Using if statements to put a range on the status and increase the status by one
        // Connecting a drawable to the button, when clicked is going to change to the designated image
        clean.setOnClickListener {
            if (textBath < 10) {
                textBath++
            }
            image.setImageResource(R.drawable.clean)
            textClean.text = textBath.toString()
        }

        // Calling the Variable "Play" which is a button, set it on Click Listener. Using if statements to put a range on the status and increase the status by one
        // Connecting a drawable to the button, when clicked is going to change to the designated image
        play.setOnClickListener {
            if (textContent < 10) {
                textContent++
            }
            image.setImageResource(R.drawable.play)
            textHappy.text = textContent.toString()
        }
    }
}