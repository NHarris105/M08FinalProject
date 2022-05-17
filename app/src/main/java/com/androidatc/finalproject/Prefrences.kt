package com.androidatc.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_prefrences.*
import kotlinx.android.synthetic.main.activity_second.*

class Prefrences : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prefrences)


        }




    fun go2mainActivity(view: View) {
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun go2secondActivity(view: View){
        var intent =Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    fun go2Help(view: View){
        var intent = Intent(this, Help::class.java)
        startActivity(intent)
    }

    fun go2Rewards(view: View){
        var intent = Intent(this, Rewards::class.java )
        startActivity(intent)
    }

    fun onSelect(view: View){
        if (dailyButton.isChecked) hiddenTime.text="Daily"

        if (weeklyButton.isChecked) hiddenTime.text="Weekly"

    }

    fun onSelectMeasurement(view: View){
        if (ouncesButton.isChecked) hiddenMeasurement.text="oz"

        if (litersButton.isChecked) hiddenMeasurement.text="L"

        if (cupsButton.isChecked) hiddenMeasurement.text="Cups"
    }

    fun saveButtonClick(view: View){
        saveButton.setOnClickListener {
            var intent = Intent(this, com.androidatc.finalproject.SecondActivity::class.java )

            intent.putExtra("time", hiddenTime.text.toString())

            intent.putExtra("measurement", hiddenMeasurement.text.toString())

            intent.putExtra("amount", intakeGoal.text.toString())


            startActivity(intent)
        }
        }
    }