package com.example.smarttimeout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.view.View

class CheckChairMain :
    AppCompatActivity(),
    View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkchairmain)

        val button1 = findViewById<Button>(R.id.buttonchairchecklist)
        val button2 = findViewById<Button>(R.id.buttonchairinspiration)
        val button3 = findViewById<Button>(R.id.buttonback)


        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.buttonchairchecklist -> {
                val intent = Intent(this, ChairChecklistMain::class.java)
                startActivity(intent)
            }
            R.id.buttonchairinspiration-> {
                val intent = Intent(this, Chairspo1Main::class.java)
                startActivity(intent)
            }
            R.id.buttonback-> {
                val intent = Intent(this, LearnMore::class.java)
                startActivity(intent)
            }

        }
    }
}