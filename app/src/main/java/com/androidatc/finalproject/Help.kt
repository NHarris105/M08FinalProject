package com.androidatc.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_help.*

class Help : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)
    }
    fun go2mainActivity(view: View) {
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun go2secondActivity(view: View){
        var intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    fun go2Prefrences(view: View){
        var intent = Intent(this, Prefrences::class.java)
        startActivity(intent)
    }

    fun go2Rewards(view: View){
        var intent = Intent(this, Rewards::class.java )
        startActivity(intent)
    }

    fun displayHome(view: View){
        info.text="The Home Page is where you will enter the amount of water you drink throughout the day"
    }

    fun displayPrefrences(view: View){
        info.text="The Prefrences Page is where you change your different settings, such as setting your goals to weekly or daily, if you want everything measured in cups, liters, or ounces, and set your water intake goal"
    }

    fun displayViewTotal(view: View){
        info.text="The View Total Page is where you can go and see how close you are to reaching your goal and what your total water intake is so far"
    }

    fun displayRewards(view: View){
        info.text="The Rewards Page is where you can go to view what rewards you have unlocked, such as meeting your goal three times in a row"
    }
}