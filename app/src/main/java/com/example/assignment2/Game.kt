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

        var textEat = 0
        var textBath = 0
        var textContent = 0
        val textHunger = findViewById<TextView>(R.id.textHunger)
        val textClean = findViewById<TextView>(R.id.textClean)
        val textHappy = findViewById<TextView>(R.id.textHappy)
        val image = findViewById<ImageView>(R.id.imageView2)
        val feed = findViewById<Button>(R.id.feedButton)
        val clean = findViewById<Button>(R.id.cleanButton)
        val play = findViewById<Button>(R.id.playButton)

        feed.setOnClickListener {
            if (textEat < 10) {
                textEat++
            }
            image.setImageResource(R.drawable.feed)
            textHunger.text = textEat.toString()
        }
        clean.setOnClickListener {
            if (textBath < 10) {
                textBath++
            }
            image.setImageResource(R.drawable.clean)
            textClean.text = textBath.toString()
        }
        play.setOnClickListener {
            if (textContent < 10) {
                textContent++
            }
            image.setImageResource(R.drawable.play)
            textHappy.text = textContent.toString()
        }
    }
}