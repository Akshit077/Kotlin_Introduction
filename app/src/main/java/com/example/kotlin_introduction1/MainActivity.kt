package com.example.kotlin_introduction1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val q1=Question1()
        q1.changeString()
        val q3=Question3()
        q3.countOccurrences()
        val q4=Question4()
        q4.calCharPercentages();
        val q5=Question5()
        q5.findCommonElements();
        val q6=Question6()
        q6.checkNonPair();
        val q2=Question2()
        q2.printOcuurences();
    }
}