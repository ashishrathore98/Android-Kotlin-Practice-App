package com.example.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.listView)
        val listItems = arrayOf("Read a book",
            "Follow the instructions",
            "Make a good plan",
            "And then finally execute it")

        //Now setting the adapter

        val listAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems)
        listView.adapter = listAdapter

        //setting click listener and toast
        listView.setOnItemClickListener{parent, view, position, id ->

            val selectedItem = parent.getItemAtPosition(position) as String
            Toast.makeText(this, "You have clicked on: $selectedItem", Toast.LENGTH_SHORT).show()
        }
    }
}