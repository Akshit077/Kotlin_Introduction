package com.example.kotlin_introduction1

class Question5 {
    fun findCommonElements() {
        val arr1 = arrayOf(1, 2, 3, 2)
        val arr2 = arrayOf(3, 1, 4, 5)

        System.out.println("Common elements are: ");
        for (num in arr1) {
            var commonElement = -1
            for (n in arr2) {
                if (num == n)
                    commonElement = num
            }
            if (commonElement > -1)
                System.out.println("$commonElement ");
        }
    }
}