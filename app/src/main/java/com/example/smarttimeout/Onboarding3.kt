package com.example.smarttimeout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.view.View

class Onboarding3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding3)

        val buttonQT: Button = findViewById(R.id.buttonob3)
        buttonQT.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                // Create the Intent to start the new activity
                val intent = Intent(this@Onboarding3, OnboardingOptions::class.java)
                // Start the new activity
                startActivity(intent)
            }
        })
    }
}