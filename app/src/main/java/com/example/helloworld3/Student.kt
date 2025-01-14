package com.example.helloworld3

class Student(val sno: String, val grade: Int, name: String, age:Int): Person(name, age) {
    constructor(name:String, age:Int) : this("", 0, name, age) {
    }

    constructor(): this("", 0) {
    }
}