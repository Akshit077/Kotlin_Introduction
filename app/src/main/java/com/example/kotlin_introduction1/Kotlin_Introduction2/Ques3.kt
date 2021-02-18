package com.example.kotlin_introduction1.Kotlin_Introduction2

open class Ques3 {
    open fun getDetails()
    {
        var roi:Int=5;
        var tax:Int=20;
        var AccType:String="Savings";
    }
}
class SBI : Ques3()
{
    override fun getDetails() {
        var roi=6;
        var tax=25;
        var AccType="Current";
        println("rate of interest of SBI is ${roi}");
        println("tax for SBI is ${tax}");
        println("AccType of SBI is ${AccType}");
    }
}
class BOI : Ques3()
{
    override fun getDetails() {
        var roi=7;
        var tax=30;
        var AccType="Balanced"
        println("rate of interest of BOI is ${roi}");
        println("tax for BOI is ${tax}");
        println("AccType of BOI is ${AccType}");
    }
}
class ICICI : Ques3()
{
    override fun getDetails() {
        var roi=8;
        var tax=40;
        var AccType="Current"
        println("rate of interest of ICICI is ${roi}");
        println("tax for ICICI is ${tax}");
        println("AccType of ICICI is ${AccType}");
    }
}