package com.example.bmi

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BMI.setOnClickListener{
             val JINA=name.text.toString()
            val H=height.text.toString().toFloat()
            val W=weight.text.toString().toFloat()

            //calculate BMI

            val BMI =W/(H*H)
            val pref=getSharedPreferences("bmifile",Context.MODE_PRIVATE)
            pref.edit()
                .putString("name",JINA)
                .putFloat("height",H)
                .putFloat("weight",W)
                .putFloat("bmi",BMI)
                .apply()

            startActivity(Intent(this,summury::class.java))


        }


    }
}
