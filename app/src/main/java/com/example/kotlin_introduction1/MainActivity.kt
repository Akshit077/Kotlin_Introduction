package com.example.kotlin_introduction1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin_introduction1.Kotlin_Introduction2.*
import com.example.kotlin_introduction1.Kotlin_Introduction3.Ab
import com.example.kotlin_introduction1.Kotlin_Introduction3.Prob4
import com.example.kotlin_introduction1.Kotlin_Introduction3.Ques2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*val q1=Question1()
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
        val q14=Ques5()
        println("For 58 marks grade is ${q14.calculateGrade(58)}");
        val q15=Ques6()
        q15.mutabeListExample();
        val q16=Ques7()
        q16.mutableMapExample();
        val q17=Ques8()
        q17.hashSetExample();*/
        /*println("Product of two numbers are ${Ques2.calculateProduct(10,20)}")
        val q18=Prob4()
        q18.printString()*/
        val q19=Ab()
        q19.printString();
    }
}