package com.example.kotlin_introduction1

class Question4 {
    fun calCharPercentages() {
        val str = "test@#STRing"
        val totalStrLength = str.length

        var lowerCase = 0
        var upperCase = 0
        var specialAndDigitChar = 0

        for (i in 0 until totalStrLength) {
            if (str[i].isLowerCase())
                lowerCase++
            else if (str[i].isUpperCase())
                upperCase++
            else
                specialAndDigitChar++
        }

        System.out.println("\nNumber of lower case characters: $lowerCase, Percentage: ${(lowerCase.toFloat() / totalStrLength.toFloat()) * 100}%")
        System.out.println("Number of upper case characters: $upperCase, Percentage: ${(upperCase.toFloat() / totalStrLength.toFloat()) * 100}%")
        System.out.println("Number of special characters and digits: $specialAndDigitChar, Percentage: ${(specialAndDigitChar.toFloat() / totalStrLength.toFloat()) * 100}%\n")
    }
}