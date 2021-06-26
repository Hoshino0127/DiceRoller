package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll : Button = findViewById(R.id.Roll_Button)

        btnRoll.setOnClickListener{
            val randomInt = (1..6).random()

            val tvResult :TextView = findViewById(R.id.Result_Textview)

            tvResult.text = randomInt.toString()
            rollDice()
        }
    }

    private fun rollDice(){


        Toast.makeText(this, "Button is clicked",
            Toast.LENGTH_SHORT).show()
    }
}