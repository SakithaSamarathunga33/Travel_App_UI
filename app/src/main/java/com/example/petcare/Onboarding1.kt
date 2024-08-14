package com.example.petcare

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Onboarding1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding1)

        // Window settings
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
          val nextButton = findViewById<Button>(R.id.next1btn)

        // Set an onClickListener to the button
        nextButton.setOnClickListener {
            // Create an Intent to start NextActivity2
            val intent = Intent(this, Onboarding2::class.java)
            startActivity(intent)  // Start the NextActivity2
        }
        }
    }
