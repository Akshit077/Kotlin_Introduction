package com.example.kotlin_introduction1.Kotlin_Introduction3

open class Prac2 {
    var str1: String = "Akshit"
    var str2: String = "Chauhan"
    var str3: String = "Hello"
    open fun printString() {
        println(str3.add(str1, str2))
    }

    open fun String.add(str1: String, str2: String): String {
        return this + str1 + str2
    }
}
class Ab: Prac2()
{

    fun String.add(str1: String,str2: String,str3:String):String
    {
        return this + str1+str2+str3
    }
    override fun printString()
    {
        println(str2.add(str1,str2,str3))
    }
}