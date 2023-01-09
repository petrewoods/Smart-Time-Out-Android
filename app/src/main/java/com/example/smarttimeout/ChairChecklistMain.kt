package com.example.smarttimeout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.view.View

class ChairChecklistMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chairchecklistmain)

        val buttonQT: Button = findViewById(R.id.buttonchairdone)
        buttonQT.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                // Create the Intent to start the new activity
                val intent = Intent(this@ChairChecklistMain, Onboarding4::class.java)
                // Start the new activity
                startActivity(intent)
            }
        })
    }
}