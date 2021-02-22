package com.example.kotlin_introduction1.Kotlin_Introduction3

sealed class Base
{
    class SubClass1
    {

    }
    class SubClass2
    {

    }
    class SubClass3
    {

    }
}

    fun getClassName(base: Any)=when(base)
    {
        is Base.SubClass1->{print("A")}
        is Base.SubClass2->{print("B")}
        is Base.SubClass3->{print("C")}
        else -> print("Invalid input");
    }
fun main()
{
    var obj=Base.SubClass3()
    getClassName(obj);
}