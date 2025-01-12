package com.example.helloworld3

fun main() {
    var a: Int = 10
    a *= 10
    println("a = $a")
    println("methodName fun returns: " + methodName(1,2))
    println("largerNumber fun returns: " + largerNumber(13,5))
}

fun methodName(param1: Int, param2: Int): Int {
    return 0
}

fun largerNumber(param1: Int, param2: Int): Int {
    var value = 0
    if (param1 > param2) {
        value = param1
    } else {
        value = param2
    }
    return value
}