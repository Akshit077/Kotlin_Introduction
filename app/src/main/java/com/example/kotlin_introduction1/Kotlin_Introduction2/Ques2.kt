package com.example.kotlin_introduction1.Kotlin_Introduction2

open class Ques2 {
    var a:Int=5;
    var b:Int=10;
    var c:Double=2.0;
    var d:Double=3.0;
    var str1:String="Akshit";
    var str2:String="Chauhan";
    var str3:String="Pro";
}
class B : Ques2()
{
    fun ArithmeticOperations()
    {
        println("Addition of 2 integer number ${a+b}");
        println("Addition of 2 double number ${c+d}");
        println("Multiplication of 2 integer number ${a*b}");
        println("Addition 2 Strings ${str1+str2}");
        println("Addition 3 Strings ${str1+str2+str3}");
    }
}