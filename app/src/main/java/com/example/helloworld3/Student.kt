package com.example.helloworld3

class Student(val sno: String, val grade: Int, name: String, age:Int): Person(name, age) {
    init {
        println("sno is $sno")
        println("grade is $grade")
    }
}