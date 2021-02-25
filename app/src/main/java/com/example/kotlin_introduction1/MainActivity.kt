package com.example.kotlin_introduction1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var b1:Button
    private lateinit var b2:Button
    private lateinit var Et:EditText
    private lateinit var Et1:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b2=findViewById(R.id.bt2)
        b1=findViewById(R.id.bt1)
        Et=findViewById(R.id.et1)
        Et1=findViewById(R.id.et2)

        //Check if password is valid or not

        fun checkPassword():Boolean
        {
            if(Et1.text.toString()==("Akshit@1234"))
            {
                Toast.makeText(applicationContext,"Login Successfully",Toast.LENGTH_SHORT).show()
                return true
            }
            else if (Et1.text.toString()=="")
            {
                Toast.makeText(applicationContext,"Fields are empty",Toast.LENGTH_SHORT).show()
                return false
            }
            else
            {
                Toast.makeText(applicationContext,"Wrong Username or Password",Toast.LENGTH_SHORT).show()
                return false
            }

        }

        //Check if username is valid or not

        fun checkUsername():Boolean
        {
            if(Et.text.toString()=="") {
                Toast.makeText(applicationContext, "Fields are empty", Toast.LENGTH_SHORT).show()
                return false
            }
            else if(Et.text.toString()=="Akshit007")
            {
                return true
            }
            else
            {
                Toast.makeText(applicationContext,"Wrong Username or Password",Toast.LENGTH_SHORT).show()
                return false
            }
        }

        //Functionality of reset button

        b2.setOnClickListener(View.OnClickListener {
            Et.setText("")
            Et1.setText("")
        })

        //Functionality of submit button

        b1.setOnClickListener(View.OnClickListener
        {
            checkPassword()
            checkUsername()
            if(checkPassword() && checkUsername())
            {
                intent =Intent(applicationContext,Home_Activity::class.java)
                startActivity(intent)
            }
        })

        /*b1.setOnClickListener(View.OnClickListener {
            if(Et1.text.toString())
        })*/
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
        //val q19=Ab()
        //q19.printString();
    }
}