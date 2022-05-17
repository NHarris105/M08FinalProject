package com.androidatc.finalproject

import android.content.ContentValues
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val db = Firebase.firestore


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        addButton.setOnClickListener {

            newAmount()


            var intent = Intent(this, SecondActivity::class.java )
            //intent.putExtra("add", EnterWaterDrank.text.toString())




            startActivity(intent)
        }}

    fun newAmount() {
        val waterDrank = hashMapOf(
            "Amount" to EnterWaterDrank.text.toString().trim())


        // Add a new document with a generated ID
        db.collection("Amount")
            .add(waterDrank)
            .addOnSuccessListener { documentReference ->
                Log.d(
                    ContentValues.TAG, "Document Snapshot added with ID:" +
                            "${documentReference.id}")}

            .addOnFailureListener { e ->
                Log.w(ContentValues.TAG, "Error adding document", e)}
    }



    fun go2secondActivity(view: View){
        var intent =Intent(this, SecondActivity:: class.java)
        startActivity(intent)
    }

    fun go2Prefrences(view: View){
        var intent = Intent(this, Prefrences::class.java)
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



}