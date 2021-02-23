package com.example.kotlin_introduction1.Kotlin_Introdution4

data class Employee(val name: String, val age:Int)

fun main()
{
    var list: List<Employee> = listOf(
            Employee("Akshit",22),
            Employee("Amrit",31),
            Employee("Gaurav",38),
            Employee("Prakash",27),
            Employee("Harshit",32),
    )
    val li=list.filter { Employee -> Employee.age>30 }

    li.forEach{Employee ->
        println(Employee.name)
    }
}