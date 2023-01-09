package com.example.smarttimeout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.view.View

class Chair1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chair1)

        val buttonQT: Button = findViewById(R.id.buttonpraise1)
        buttonQT.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                // Create the Intent to start the new activity
                val intent = Intent(this@Chair1, Onboarding3::class.java)
                // Start the new activity
                startActivity(intent)
            }
        })
    }
}