package com.example.kotlin_introduction1.Kotlin_Introduction3

fun main()
{
    var a="Ball" to "Cricket"
    var items1=Triple(a,"Akshit","Chauhan")
    var list1=listOf(items1.first.toList());
    for(i in 0 until list1.size)
    {
        println(list1[i]);
    }
    println("Second element in the triplet is ${items1.second}");
    println("Third element in the triplet is ${items1.third}");
}