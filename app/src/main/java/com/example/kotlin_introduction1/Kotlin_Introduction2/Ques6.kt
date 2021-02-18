package com.example.kotlin_introduction1.Kotlin_Introduction2

class Ques6 {

    fun mutabeListExample()
    {
        var Mlist= mutableListOf<Int>(10,60,30,40,50);
        println("Contents of list earlier are:");
        for(element in Mlist)
        {
            println(element);
        }
        Mlist.set(1,20);
        println("Updated content of list are:");
        for(element in Mlist)
        {
            println(element);
        }
    }
}