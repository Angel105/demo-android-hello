package com.example.helloworld3

class Student(val sno: String = "a123", val grade: Int = 0, name: String = "", age:Int = 0): Person(name, age) {
    override fun run() {
        println("Student $name, having serial number $sno,  is running grade $grade. He is $age years old.")
    }
}