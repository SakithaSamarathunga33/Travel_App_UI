package com.example.petcare

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)

        // Window settings
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        val nextButton = findViewById<Button>(R.id.btnOption1)

        // Set an onClickListener to the button
        nextButton.setOnClickListener {
            // Create an Intent to start NextActivity2
            val intent = Intent(this, TProfile::class.java)
            startActivity(intent)  // Start the NextActivity2
        }

        val newButton = findViewById<Button>(R.id.btnOption2)

        // Set an onClickListener to the button
        newButton.setOnClickListener {
            // Create an Intent to start NextActivity2
            val intent = Intent(this, Vaccine::class.java)
            startActivity(intent)  // Start the NextActivity2
        }

        val lastButton = findViewById<Button>(R.id.btnOption3)

        // Set an onClickListener to the button
        lastButton.setOnClickListener {
            // Create an Intent to start NextActivity2
            val intent = Intent(this, Support::class.java)
            startActivity(intent)  // Start the NextActivity2
        }

        val profileButton = findViewById<Button>(R.id.btnOption4)

        // Set an onClickListener to the button
        profileButton.setOnClickListener {
            // Create an Intent to start NextActivity2
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)  // Start the NextActivity2
        }


    }
}