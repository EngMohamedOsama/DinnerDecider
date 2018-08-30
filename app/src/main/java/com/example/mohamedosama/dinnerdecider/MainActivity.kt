package com.example.mohamedosama.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val foodArray = arrayListOf("Pizza Hut", "Buffalo Burger", "Food Gun", "KFC")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val randomNumber = Random().nextInt(foodArray.count())
            foodTxt.text = foodArray[randomNumber]
        }

        addFoodBtn.setOnClickListener {
            val newFood = addFoodTxt.text
            foodArray.add(newFood.toString())
            newFood.clear()
        }
    }
}
