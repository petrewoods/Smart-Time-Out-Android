package com.example.smarttimeout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.view.View

class OnboardingOptions :
    AppCompatActivity(),
    View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboardingoptions)

        val button1 = findViewById<Button>(R.id.buttonEveryDayPraise)
        val button2 = findViewById<Button>(R.id.buttoncc1)
        val button3 = findViewById<Button>(R.id.buttonExplainTO)
        val button4 = findViewById<Button>(R.id.buttonFinish)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.buttonEveryDayPraise -> {
                val intent = Intent(this, PraiseWhy::class.java)
                startActivity(intent)
            }
            R.id.buttoncc1 -> {
                val intent = Intent(this, CheckChair::class.java)
                startActivity(intent)
            }
            R.id.buttonExplainTO -> {
                val intent = Intent(this, ExplainTO1::class.java)
                startActivity(intent)
            }
            R.id.buttonFinish -> {
                val intent = Intent(this, SetupFinish::class.java)
                startActivity(intent)
            }
        }
    }
}

