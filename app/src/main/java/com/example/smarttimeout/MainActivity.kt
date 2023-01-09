package com.example.smarttimeout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //check if app opened for the first time
        val preferences = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
        val FirstTime = preferences.getString("FirstTimeInstall", "")

        if(FirstTime == ""){
            //If app is opened for the first time
            val intent = Intent(this, Onboarding1::class.java)
            val editor = preferences.edit()
            //add yes to the empty string below once you've finished making onboarding 1/2
            editor.putString("FirstTimeInstall", "yes")
            editor.apply()
            startActivity(intent)
        }
        else{
            //if not the first time...
            val editor = preferences.edit()
            //add yes to the empty string below once you've finished making onboarding 1/2
            editor.putString("FirstTimeInstall", "yes")
            editor.apply()
        }

        val buttonQT: Button = findViewById(R.id.buttonEveryDayPraise)
        buttonQT.setOnClickListener {
            // Create the Intent to start the new activity
            val intent = Intent(this@MainActivity, OptionViewQuietTime::class.java)
            // Start the new activity
            startActivity(intent)
        }
    }
}


