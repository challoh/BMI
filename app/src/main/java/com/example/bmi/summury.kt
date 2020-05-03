package com.example.bmi

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_summury.*

class summury : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summury)

        val pref=getSharedPreferences("bmifile",Context.MODE_PRIVATE)
        val name=pref.getString("name","No name provided")
        val height=pref.getFloat("height",0.0f)
        val weight=pref.getFloat("weight",0.0f)
        val bmi=pref.getFloat("bmi",0.0f)

        text1.text=name
       text2.text=weight.toString()
        text3.text=weight.toString()
        text4.text=weight.toString()

        if (bmi==0.0f){
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}
