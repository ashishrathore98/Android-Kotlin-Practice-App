package com.example.intents

import android.app.Notification.Action
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Explicit Button

      val explicitButton = findViewById<Button>(R.id.btnGo)
        explicitButton.setOnClickListener{
            val explicitIntent = Intent(this, RedActivity::class.java)
            startActivity(explicitIntent)
        }

        //Implicit Button

        val url = "https://developers-tutorials.medium.com/kotlin-tutorial-8a5c0c26adaf"
        val implicitButton = findViewById<Button>(R.id.ImplicitButton)
        implicitButton.setOnClickListener{
            val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(implicitIntent)
        }
    }
}

