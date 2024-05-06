package com.example.mypetfriend

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
val startButton: Button=findViewById<Any>(R.id.startButton)

private fun Int.setOnClickListener(function: () -> MainActivity2) {

}

fun <T> findViewById(startButton: Int): Button {
    return TODO("Provide the return value")

    startButton.setOnClickListener {
        val intent = Intent("this, virtual::class.java")
        return@setOnClickListener MainActivity2()
    }
}