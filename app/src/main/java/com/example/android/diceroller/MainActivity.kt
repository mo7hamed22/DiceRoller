package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    //tell compiler this var will be intilze before any operation on it
   lateinit var dice_img : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton : Button =findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }
        dice_img =findViewById(R.id.dice_imag)

    }

    private fun rollDice() {
        val randm =Random().nextInt(6)+1
        val img_selected = when( randm )
        {
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else ->R.drawable.dice_6
        }
        dice_img.setImageResource(img_selected)


    }
}
