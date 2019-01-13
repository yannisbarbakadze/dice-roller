package com.example.android.diceroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            val value1 = rollDice()
            val value2 = rollDice()

            val res1 = resources.getIdentifier("dice_$value1", "drawable", "com.example.android.diceroller")
            val res2 = resources.getIdentifier("dice_$value2", "drawable", "com.example.android.diceroller")

            first_dice_image.setImageResource(res1)
            second_dice_image.setImageResource(res2)
        }
    }

    private fun rollDice(): Int {
        return Random().nextInt(6) + 1
    }
}
