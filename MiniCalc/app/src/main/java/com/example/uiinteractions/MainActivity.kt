package com.example.uiinteractions

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        // Get references to the UI elements

        val etVar1 =  findViewById<EditText>(R.id.etVar1).text
        val etVar2 =  findViewById<EditText>(R.id.etVar2).text
        val btnAdd =  findViewById<Button>(R.id.btnAdd)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        //set click listener to the buttons
        btnAdd.setOnClickListener{
            //not convert string to integer
            val number1 = etVar1.toString().toIntOrNull() ?:0
            val number2 = etVar2.toString().toIntOrNull() ?:0

            //Calculate the sum
            val sum = number1 + number2

            //Display the result in the textView
            tvResult.text = sum.toString()
        }

    }

}