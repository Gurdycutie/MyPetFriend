package com.example.mypetfriend

import android.annotation.SuppressLint
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable

class MainActivity2 : AppCompatActivity() {
    private var health = 100
    private var hunger = 0
    private var cleanliness = 100
}

private operator fun String.invoke(activityStart: Int) {
    TODO("Not yet implemented")


    fun feed() {
        TODO("Not yet implemented")
    }

    fun clean() {

    }

    fun play() {
        TODO("Not yet implemented")
    }

    fun updateStatusText() {

    }

    @Composable
    fun ActivityContent() {


        clean()

        feed()

        play()
        updateStatusText()

        @Composable
        @SuppressLint("WrongViewCast")
        fun <Bundle> onCreate(saveInstanceState: Bundle?) {
            val onCreate = onCreate("savedInstanceState")
            "setContentView"(R.layout.activity_main2)

            val petImage = androidx.compose.foundation.layout.Box {
                findViewById<ImageView>(R.id.petImage)
            }
            val feedButton: Button = findViewById<Any>(R.id.feedButton)
            val cleanButton: Button = findViewById<Any>(R.id.cleanButton)
            val playButton: Button = findViewById<Any>(R.id.playButton)

            feedButton.setOnClickListener {
                feed()
                Glide.with("activity this")
                    .load(R.drawable.eating)
                    .into(petImage)
            }
            cleanButton.setOnClickListener {
                clean()
                Glide.with("activity this")
                    .load(R.drawable.bathing)
                    .into(petImage)
            }
            playButton.setOnClickListener {
                play()
                Glide.with("activity this")
                    .load(R.drawable.playing)
                    .into(petImage)
            }
            updateStatusText()
        }

        fun Any.into(petImage: Unit) {

        }

        fun Any.load(eating: Int): Any {
            TODO("Not yet implemented")
        }

        fun feed() {
            var hunger = 20
            if (hunger < 0) hunger = 100
            updateStatusText()
        }

        fun updateStatusText() {
            TODO("Not yet implemented")
        }

        fun clean() {
            var cleanliness = 100
            var health = 5
            if (health > 100) health = 100
            updateStatusText()
        }

        fun play() {
            var health = 10
            if (health < 0) health = 0
            var hunger = 20
            if (hunger > 100) hunger = 0
            var cleanliness = 10
            if (cleanliness < 0) cleanliness = 0
            updateStatusText()
        }

        fun updateStatusText(cleanliness: String, hunger: String, health: String) {
            val statusText: TextView = findViewById<Any>(R.id.statusText)
            val healthStatus = "Health: $health"
            val hungerStatus = "Hunger: $hunger"
            val cleanlinessStatus = "Cleanliness: $cleanliness"
            val combinedStatus = "$healthStatus, $hungerStatus, $cleanlinessStatus"
            statusText.text = combinedStatus
        }
        class startActivity {

        }
    }
}

private fun Any.into(petImage: Unit) {
    TODO("Not yet implemented")
}

private fun Any.load(eating: Int): Any {

    return TODO("Provide the return value")
}
