package com.example.helloworld3

fun main() {
    var a: Int = 10
    a *= 10
    println("a = $a")
    println("methodName fun returns: " + methodName(1, 2))
    println("largerNumber fun returns: " + largerNumber(13, 5))
    println("getScore fun returns: " + getScore("Tommy"))
    val num = 10L
    checkNumber(num)
    performLoop()
    val p = Person("Jack", 19)
    p.run()
    val student = Student("a123", 5)
    student.run()
    val student2 = Student("Jack", 19)
    doStudy(student2)
    val cellphone1 = CellPhone("Samsung", 1299.99)
    val cellphone2 = CellPhone("Samsung", 1299.99)
    println(cellphone1)
    println("cellphone1 equals cellphone2: "+ (cellphone1 == cellphone2))
    Singleton.singletonTest()
}

fun doStudy(study: Study) {
    study.read()
    study.doHomework()
}

fun methodName(param1: Int, param2: Int): Int {
    return 0
}

fun largerNumber(param1: Int, param2: Int) = if (param1 > param2) param1 else param2

fun getScore(name: String) = when {
    name.startsWith("Tom") -> 86
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

fun performLoop() {
    for (i in 10 downTo  1) {
        print("i = $i; ")
    }
    println()
}
