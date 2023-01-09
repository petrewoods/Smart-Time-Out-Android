package com.example.smarttimeout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.view.View

class Chairspo2Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chairspo2main)

        val buttonQT: Button = findViewById(R.id.buttonchairspo2)
        buttonQT.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                // Create the Intent to start the new activity
                val intent = Intent(this@Chairspo2Main, Chairspo3Main::class.java)
                // Start the new activity
                startActivity(intent)
            }
        })
    }
}