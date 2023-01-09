package com.example.smarttimeout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.view.View

class PraiseWhy2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.praisewhy2)

        val buttonP1: Button = findViewById(R.id.buttonpraise1)
        buttonP1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                // Create the Intent to start the new activity
                val intent = Intent(this@PraiseWhy2, Praise2::class.java)
                // Start the new activity
                startActivity(intent)
            }
        })
    }
}