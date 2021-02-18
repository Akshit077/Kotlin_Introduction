package com.example.kotlin_introduction1.Kotlin_Introduction2

class Ques1(Fname:String,Lname:String,age:Int)
{
    init {
        System.out.println("First name is ${Fname}");
        System.out.println("Last name is ${Lname}");
        System.out.println("Age is ${age}");
    }
    companion object
    {
        var f_name: String="Amrit";
        var l_name: String="Kumar";
        var age: Int=23;
    }
    fun main()
    {
        var ref1=Ques1("Akshit","Chauhan",22);
        println("First name using comapanion object is ${Ques1.f_name}");
        println("Last name using comapanion object is ${Ques1.l_name}");
        println("Age using comapanion object is ${Ques1.age}");
    }
}