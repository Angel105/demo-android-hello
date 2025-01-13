package com.example.helloworld3

fun main() {
    var a: Int = 10
    a *= 10
    println("a = $a")
    println("methodName fun returns: " + methodName(1, 2))
    println("largerNumber fun returns: " + largerNumber(13, 5))
    println("getScore fun returns: " + getScore("Jim"))
    val num = 10L
    checkNumber(num)
}

fun methodName(param1: Int, param2: Int): Int {
    return 0
}

fun largerNumber(param1: Int, param2: Int) = if (param1 > param2) param1 else param2

fun getScore(name: String) = when {
    name == "Tom" -> 86
    name == "Jim" -> 77
    name == "Jack" -> 95
    name == "Lily" -> 100
    else -> 0
}

fun checkNumber(num: Number) {
    when (num) {
        is Int -> println("number is Int")
        is Double -> println("number is Double")
        else -> println("number not supported")
    }
}