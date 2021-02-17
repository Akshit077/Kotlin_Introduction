package com.example.kotlin_introduction1

class Question1 {
    fun changeString()
    {
        var value1: String= "My name is Akshit Chauhan"
        var value2: String= value1.replace("name","Full Name");
        System.out.println(value1);
        System.out.println("Updated string is");
        System.out.println(value2);
    }
}