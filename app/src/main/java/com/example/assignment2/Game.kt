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

        val textEat = Int
        val textBath = Int
        val textJoy = Int
        val textHunger = findViewById<TextView>(R.id.textHunger)
        val textClean = findViewById<TextView>(R.id.textClean)
        val textHappy = findViewById<TextView>(R.id.textHappy)
        val image = findViewById<ImageView>(R.id.imageView2)
        val feed = findViewById<Button>(R.id.feedButton)
        val clean = findViewById<Button>(R.id.cleanButton)
        val play = findViewById<Button>(R.id.playButton)

        feed.setOnClickListener {
            image.setImageResource(R.drawable.feed)




        }
        clean.setOnClickListener {
            image.setImageResource(R.drawable.clean)


        }
        play.setOnClickListener {
            image.setImageResource(R.drawable.play)


        }
    }
}