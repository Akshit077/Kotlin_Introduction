package com.example.kotlin_introduction1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin_introduction1.Kotlin_Introduction2.*

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
        val q7= Ques1("Akshit","Chauhan",23)
        q7.main();
        val q8= B()
        q8.ArithmeticOperations();
        val q9=SBI()
        q9.getDetails();
        val q10=BOI()
        q10.getDetails();
        val q11=ICICI();
        q11.getDetails();
        val q12=Main()
        q12.issueBook();
        q12.returnBook();
        q12.checkFine();
        val q13=MainF()
        q13.checkBookAvailable();
    }
}