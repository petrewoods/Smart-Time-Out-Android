package com.example.smarttimeout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.view.View

class PraiseWhyMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.praisewhymain)

        val buttonP1: Button = findViewById(R.id.buttonpraise1)
        buttonP1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                // Create the Intent to start the new activity
                val intent = Intent(this@PraiseWhyMain, Praise2Main::class.java)
                // Start the new activity
                startActivity(intent)
            }
        })
    }
}