package com.example.helloworld3

class MySet<T> (private val helperSet: HashSet<T>): Set<T> by helperSet {

    fun helloWorld() = println("Hello World")

    override fun isEmpty() = false
}