
package com.example.smarttimeout


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.view.View

class OptionViewQuietTime :
    AppCompatActivity(),
    View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.optionviewquiettime_main)

        val button1 = findViewById<Button>(R.id.buttonStartQT)
        val button2 = findViewById<Button>(R.id.buttonLearn)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.buttonStartQT-> {
                val intent = Intent(this, Timer1::class.java)
                startActivity(intent)
            }
            R.id.buttonLearn -> {
                val intent = Intent(this, LearnMore::class.java)
                startActivity(intent)
            }
        }

    }
}