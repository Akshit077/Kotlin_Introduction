package com.example.kotlin_introduction1

class Question6 {

    fun checkNonPair() {
        val str = "AABDDCCEFF"
        var i = 0
        println("Non pair elements are: ")
        while (i < str.length - 1) {
            if (str[i] != str[i + 1]) {
                System.out.println(str[i] + " ");
                i++
            } else
                i += 2
        }
        if (str[str.length - 1] != str[str.length - 2])
            System.out.println(str[str.length - 1]);
    }
}