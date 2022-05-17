package com.androidatc.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_rewards.*
import kotlinx.android.synthetic.main.activity_rewards.view.*
import kotlinx.android.synthetic.main.activity_second.*

class Rewards : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rewards)

        currentTotal.text= intent.getStringExtra("add")


        rewards.setOnClickListener {
            if (currentTotal.toString() >= currentGoal.toString()) {
                firstGoal.visibility=(View.VISIBLE)
            }
        }
    }
    fun go2mainActivity(view: View) {
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun go2secondActivity(view: View){
        var intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    fun go2Help(view: View){
        var intent = Intent(this, Help::class.java)
        startActivity(intent)
    }

    fun go2Prefrences(view: View){
        var intent = Intent(this, Prefrences::class.java )
        startActivity(intent)
    }
}