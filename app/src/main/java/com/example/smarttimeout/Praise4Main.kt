package com.example.smarttimeout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.view.View

class Praise4Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.praise4main)

        val buttonP5: Button = findViewById(R.id.buttonpraise5)
        buttonP5.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                // Create the Intent to start the new activity
                val intent = Intent(this@Praise4Main, Praise5Main::class.java)
                // Start the new activity
                startActivity(intent)
            }
        })
    }
}