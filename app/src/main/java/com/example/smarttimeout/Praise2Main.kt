package com.example.smarttimeout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.view.View

class Praise2Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.praise2main)

        val buttonP3: Button = findViewById(R.id.buttonpraise3)
        buttonP3.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                // Create the Intent to start the new activity
                val intent = Intent(this@Praise2Main, Praise3Main::class.java)
                // Start the new activity
                startActivity(intent)
            }
        })
    }
}