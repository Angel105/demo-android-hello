package com.example.helloworld3

import kotlin.math.max


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

fun largerNumber(param1: Int, param2: Int) = max(param1, param2)
