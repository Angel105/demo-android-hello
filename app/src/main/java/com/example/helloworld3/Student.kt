package com.example.helloworld3

class Student(name:String, age:Int): Person(name, age), Study {
    override fun read() {
        println("$name is reading.")
    }
}