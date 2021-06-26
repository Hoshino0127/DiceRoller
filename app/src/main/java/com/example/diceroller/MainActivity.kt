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
        val btnCount : Button = findViewById(R.id.Count_Button)

        val tvResult :TextView = findViewById(R.id.Result_Textview)

        btnRoll.setOnClickListener{
            val randomInt = (1..6).random()



            tvResult.text = randomInt.toString()

            rollDice()
        }

        btnCount.setOnClickListener{
            val currentText : String = tvResult.text.toString()
            when (currentText) {
                "Hello World!" -> tvResult.text = "1"
                "6" -> tvResult.text = "6"
                "1","2","3","4","5" -> { // Note the block
                    val addUpInt = currentText.toInt() + 1
                    tvResult.text = addUpInt.toString()
                }
            }
        }
    }

    private fun rollDice(){


        Toast.makeText(this, "Button is clicked",
            Toast.LENGTH_SHORT).show()
    }
}