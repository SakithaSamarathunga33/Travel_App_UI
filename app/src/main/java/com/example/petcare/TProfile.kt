package com.example.petcare

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tprofile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        // Window settings
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        val image = findViewById<ImageView>(R.id.imageView1)


        image.setOnClickListener {
            // Create an Intent to start the upcomingMovie activity
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        val lastimage = findViewById<ImageView>(R.id.ivProfileImage)


        lastimage.setOnClickListener {
            // Create an Intent to start the upcomingMovie activity
            val intent = Intent(this, Photo::class.java)
            startActivity(intent)
        }
    }
    }
