package com.androidatc.finalproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    val db = Firebase.firestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)



        //recentAmount.text = intent.getStringExtra("add")

        dailyWeeklyChoice.text = intent.getStringExtra("time")

        measurementChoice.text = intent.getStringExtra("measurement")

        amountChoice.text = intent.getStringExtra("amount")

        addToTotalBtn.setOnClickListener {

            readFireStoreData()

        }

        viewTotal.setOnClickListener {

            var intent = Intent(this, Rewards::class.java )
            intent.putExtra("add", enterTotal.text.toString())




            startActivity(intent)
        }

    }


    fun readFireStoreData() {
        val db = FirebaseFirestore.getInstance()


        db.collection("Amount")
            .get()
            .addOnCompleteListener {
                val result: StringBuffer = StringBuffer()
                if (it.isSuccessful) {
                    for (document in it.result!!) {
                        result.append(document.data.getValue("Amount")).append("       ")

                    }
                    recentAmount.setText(result)                }
            }}




    fun go2mainActivity(view: View) {
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun go2Prefrences(view: View) {
        var intent = Intent(this, Prefrences::class.java)
        startActivity(intent)
    }

    fun go2Help(view: View) {
        var intent = Intent(this, Help::class.java)
        startActivity(intent)
    }

    fun go2Rewards(view: View) {
        var intent = Intent(this, Rewards::class.java)
        startActivity(intent)
    }

 }









