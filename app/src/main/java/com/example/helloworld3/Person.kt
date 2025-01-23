package com.example.helloworld3

open class Person(val name: String, val age: Int) {
    open fun run() {
        println("$name is running. He is $age years old.")
    }
}