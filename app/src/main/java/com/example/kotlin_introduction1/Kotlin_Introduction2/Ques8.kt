package com.example.kotlin_introduction1.Kotlin_Introduction2

class Ques8 {

    fun hashSetExample()
    {
        var Hset= hashSetOf<Int>(10,12,14,16,18);
        println("Contents of hashset are:");
        for(element in Hset)
        {
            println(element);
        }
    }
}