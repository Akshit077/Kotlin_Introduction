package com.example.kotlin_introduction1.Kotlin_Introdution4


fun main(args:Array<String>) {

    var obj=LamabdaExample()
    val myLambda: (Int) -> Unit = { s: Int -> println(s) }
    obj.calculateInterest(1000,3,2,myLambda)
}
class LamabdaExample
{
    fun calculateInterest(Principal:Int,Rate:Int,Time:Int,action:(Int) -> Unit)
    {
        val Interest=(Principal*Rate*Time)/100
        action(Interest)
    }
}