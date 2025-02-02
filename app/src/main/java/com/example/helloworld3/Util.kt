package com.example.helloworld3

class Util {
    fun doAction1() {
        println("doing action 1")
    }

    companion object {

        @JvmStatic
        fun doAction2() {
            println("doing action 2")
        }
    }
}