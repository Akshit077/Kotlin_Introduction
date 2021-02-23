package com.example.kotlin_introduction1.Kotlin_Introduction3

//NoClassDefFoundError to be acheived.
class Exception: Throwable()
{
    fun displayException(message: String)
    {
        throw NoClassDefFoundError(message)
    }
}
fun main()
{
    val exception=Exception()
    exception.displayException("this is my Exception")
}