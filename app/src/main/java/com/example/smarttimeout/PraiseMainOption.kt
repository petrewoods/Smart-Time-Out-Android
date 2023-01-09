package com.example.smarttimeout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.view.View

class PraiseMainOption : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.praisemainoption)

        val buttonCC: Button = findViewById(R.id.buttonCheckChair)
        buttonCC.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                // Create the Intent to start the new activity
                val intent = Intent(this@PraiseMainOption, CheckChairMain::class.java)
                // Start the new activity
                startActivity(intent)
            }
        })
        val buttonIn: Button = findViewById(R.id.buttonInspo)
        buttonIn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                // Create the Intent to start the new activity
                val intent = Intent(this@PraiseMainOption, Chairspo1Main::class.java)
                // Start the new activity
                startActivity(intent)
            }
        })
    }
}