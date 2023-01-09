package com.example.smarttimeout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.view.View

class Praise5Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.praise5main)

        val buttonOO: Button = findViewById(R.id.buttonpraise6)
        buttonOO.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                // Create the Intent to start the new activity
                val intent = Intent(this@Praise5Main, LearnMore::class.java)
                // Start the new activity
                startActivity(intent)
            }
        })
    }
}