


package com.example.smarttimeout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.view.View

class LearnMore :
    AppCompatActivity() ,
    View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.learnmore)


        val button1 = findViewById<Button>(R.id.buttonPreparation)
        val button2 = findViewById<Button>(R.id.buttonPraise)
        val button3 = findViewById<Button>(R.id.buttonTimeOut)
        val button4 = findViewById<Button>(R.id.buttonAboutUs)
        val button5 = findViewById<Button>(R.id.buttonSettings)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.buttonPreparation -> {
                val intent = Intent(this, PrepareOption::class.java)
                startActivity(intent)
            }
            R.id.buttonPraise -> {
                val intent = Intent(this, CheckChairMain::class.java)
                startActivity(intent)
            }
            R.id.buttonTimeOut -> {
                val intent = Intent(this, ExplainTO2::class.java)
                startActivity(intent)
            }

            R.id.buttonAboutUs -> {
                val intent = Intent(this, SetupFinish::class.java)
                startActivity(intent)
            }

            R.id.buttonFinish -> {
                val intent = Intent(this, SetupFinish::class.java)
                startActivity(intent)
            }
        }
    }
}

