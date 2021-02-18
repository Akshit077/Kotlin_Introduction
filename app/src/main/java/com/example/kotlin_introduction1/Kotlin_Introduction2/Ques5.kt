package com.example.kotlin_introduction1.Kotlin_Introduction2

class Ques5 {

    fun calculateGrade(marks:Int):String
    {
       var grade= when(marks)
        {
            in 50..60-> "Good";
            in 60..70-> "Very Good";
            in 70..80-> "Excellent";
            in 80..100->"Rockstar";
           else->"Cannot be graded";
        }
        return grade;
    }
}