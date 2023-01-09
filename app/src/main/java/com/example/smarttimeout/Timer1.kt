package com.example.smarttimeout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import android.os.CountDownTimer
import android.widget.NumberPicker
import android.widget.ToggleButton
import android.widget.TextView

//this is driving me mad AAAAAAA
//Can pause the timer, if toggles both on then go off it pauses (great)
//if togles then go back on onfinish is called when really this should resume
// on finish should only really be called if timer gets to 0

class Timer1 : AppCompatActivity() {
    // variables to store the user's age, timeout and quiet settings,
    // whether the timer is running, and the time remaining on the timer
    var age = 3
    var timeout = false
    var quiet = false
    var timerRunning = false
    var timeRemaining = 0

    // countdown timer object
    lateinit var countDownTimer: CountDownTimer

    // views for the age selector, timeout and quiet toggle buttons, and timer text view
    lateinit var ageSelector: NumberPicker
    lateinit var timeoutToggle: ToggleButton
    lateinit var quietToggle: ToggleButton
    lateinit var timerTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.timer1)

        // initialize views
        ageSelector = findViewById(R.id.ageSelector)
        timeoutToggle = findViewById(R.id.timeoutToggle)
        quietToggle = findViewById(R.id.quietToggle)
        timerTextView = findViewById(R.id.timerTextView)

        // set up age selector
        ageSelector.minValue = 3
        ageSelector.maxValue = 10
        ageSelector.wrapSelectorWheel = false
        ageSelector.setOnValueChangedListener { _, _, newVal ->
            age = newVal
        }

        // initialize countdown timer
        countDownTimer = object : CountDownTimer(1, 1) {
            override fun onTick(millisUntilFinished: Long) {}
            override fun onFinish() {}
        }

        // set up timeout toggle button
        timeoutToggle.setOnCheckedChangeListener { _, isChecked ->
            timeout = isChecked
            timerRunning = timeout && quiet
            if (timeout && quiet) {
                // start or resume timer
                startTimer()
            } else if (!timeout && !quiet) {
                // pause timer
                countDownTimer.cancel()
                updateCountdownUI()
            }
        }

        // set up quiet toggle button
        quietToggle.setOnCheckedChangeListener { _, isChecked ->
            quiet = isChecked
            timerRunning = timeout && quiet
            if (timeout && quiet) {
                // start or resume timer
                startTimer()
            } else if (!timeout && !quiet) {
                // pause timer
                countDownTimer.cancel()
                updateCountdownUI()
            }
        }
    }

    private fun startTimer() {
        if (timeout && quiet) {
            timerRunning = true
            if (timeRemaining == 0) {
                timeRemaining = age * 60000 // convert age to minutes
            }
            else{
                countDownTimer.cancel()
            }
            updateCountdownUI()

//          countDownTimer.cancel()
            countDownTimer = object : CountDownTimer(timeRemaining.toLong(), 1000)
            {

                override fun onTick(millisUntilFinished: Long) {
                    timeRemaining = millisUntilFinished.toInt() / 1000
                    updateCountdownUI()
                }

                override fun onFinish() {
                    updateCountdownUI()
                    timerRunning = true
                }
            }
            countDownTimer.start()
        }
    }


    private fun updateCountdownUI() {
        if (timerRunning) {
            // if the timer is running, display the time remaining in the format "minutes:seconds"
            val minutes = timeRemaining / 60
            val seconds = timeRemaining % 60
            timerTextView.text = "$minutes:$seconds"
        } else {
            // if the timer is not running, display a message indicating that the timer is paused
            if (timeRemaining > 0) {
                val minutes = timeRemaining / 60
                val seconds = timeRemaining % 60
                timerTextView.text = "Paused: $minutes:$seconds"
                countDownTimer.cancel()

            } else {
                // if the timer has finished, display a message indicating that the timeout is done
                timerTextView.text = "Time out is done else."
            }
        }
    }

    private fun showTimeoutDoneUI() {

            // if the timer has finished, display a message indicating that the timeout is done
            timerTextView.text = "Time out is done showTimeoutDneUI."
        }

}