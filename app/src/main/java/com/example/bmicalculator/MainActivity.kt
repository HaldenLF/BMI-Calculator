// This project was guided by the following resources
//
// Code with Cal. (2022, July 24th). Beginner Kotlin Android Studio Project - BMI Calculator Tutorial. YouTube [Video}. https://www.youtube.com/watch?v=R7H6vfVMN3g&t=183s&ab_channel=CodeWithCal
// Codes Easy. (2023, July 2nd). How to Create a BMI Calculator in Android Studio. YouTube [Video]. https://www.youtube.com/watch?v=FVyhFapDS4U&t=3s&ab_channel=CodesEasy
// Praveenruhil. (n.d.). Kotlin When Expression. geeksforgeeks.org. https://www.geeksforgeeks.org/kotlin-when-expression/


package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextWeight = findViewById<EditText>(R.id.weight)
        val editTextHeight = findViewById<EditText>(R.id.height)
        val button = findViewById<Button>(R.id.calcltButton)
        val textView = findViewById<TextView>(R.id.result)

        button.setOnClickListener {
            val height = editTextHeight.text.toString().toDouble() / 100
            val weight = editTextWeight.text.toString().toDouble()

            val bmiCalculator = bmiCalculator("", weight, height)
            val bmi = bmiCalculator.calculate()
            val bmiStatus = bmiCalculator.bmiStatus(bmi)

            val message = when(bmiStatus) {
                bmiCategories.underweight -> "You are underweight."
                bmiCategories.normalWeight -> "You are normal weight."
                bmiCategories.overweight -> "You are overweight."
                bmiCategories.obese -> "You are obese."
            }

            val formatBMI = String.format("%.2f", bmi)

            textView.text = "Your BMI is $formatBMI.\n $message"
        }
    }

}

enum class bmiCategories  {
    underweight,
    normalWeight,
    overweight,
    obese
}

class bmiCalculator(val gender: String, val weight: Double, val height: Double) {
    fun calculate(): Double {
        return weight / (height * height)
    }
    fun bmiStatus(bmi: Double): bmiCategories {
        return when (bmi) {
            in 0.0..18.5 -> bmiCategories.underweight
            in 18.5..25.0 -> bmiCategories.normalWeight
            in 25.0..30.0 -> bmiCategories.overweight
            else -> bmiCategories.obese
        }
    }
}

