package com.example.kotlin_introduction1.Kotlin_Introduction2

open class Ques4 {

    var b1:String="Book1";
    var b2:String="Book2";
    var b3:String="Book3";
    var b4:String="Book4";
    var b5:String="Book5";
    open fun issueBook()
    {
        println("Issued books are ${b1},${b2},${b3}");
    }
    open fun returnBook()
    {
        println("returned books are ${b4},${b5}");
    }
}
interface A1
{
    fun checkFine()
}
abstract class A2
{
    abstract fun checkBookAvailable()
}
class Main : Ques4(), A1
{
    override fun issueBook() {
        super.issueBook()
    }

    override fun returnBook() {
        super.returnBook()
    }
    override fun checkFine() {
        println("fine for user1 is ${500}");
    }
}
class MainF : A2()
{
    var b6:String="Book6"
    var b7:String="Book7"
    override fun checkBookAvailable() {
        println("books available are ${b6},${b7}");
    }

}
