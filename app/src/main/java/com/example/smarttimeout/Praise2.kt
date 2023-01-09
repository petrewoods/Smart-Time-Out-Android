package com.example.smarttimeout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.view.View

class Praise2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.praise2)

        val buttonP3: Button = findViewById(R.id.buttonpraise3)
        buttonP3.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                // Create the Intent to start the new activity
                val intent = Intent(this@Praise2, Praise3::class.java)
                // Start the new activity
                startActivity(intent)
            }
        })
    }
}