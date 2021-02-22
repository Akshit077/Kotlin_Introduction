package com.example.kotlin_introduction1.Kotlin_Introduction3

class Prob4 {
    var str1: String = "Akshit"
    var str2: String = "Chauhan"
    var str3: String = "Hello"
    fun printString() {
        println(str3.add(str1, str2));
    }
}

    fun String.add(str1: String, str2: String): String {
        return this + str1 + str2;
    }

