package com.example.helloworld3

fun String.lettersCount(): Int {
    var count = 0
    for (char in this) {
        if (char.isLetter()) {
            count++
        }
    }
    return count
}

operator fun String.times(n: Int) = repeat(n)

fun getRandomLengthString(str: String) = str * (1..20).random()