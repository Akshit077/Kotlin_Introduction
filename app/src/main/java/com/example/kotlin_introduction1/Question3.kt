package com.example.kotlin_introduction1

class Question3 {
        fun countOccurrences() {
            val str="Java is new Java a value java"
            val ch='a'
            System.out.println("Occurence of a in str is");
            System.out.println(str.length - str.replace(ch.toString(), "").length);
        }
        }