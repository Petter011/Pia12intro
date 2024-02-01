package com.example.pia12intro

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var minsiffra = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val mintext = findViewById<TextView>(R.id.textView)
        mintext.text = "Banan"

        val minknapp = findViewById<Button>(R.id.button)
        minknapp.setOnClickListener {

            minsiffra += 1

            mintext.text = minsiffra.toString()
        }
    }
}