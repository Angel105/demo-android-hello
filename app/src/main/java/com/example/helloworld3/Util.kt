package com.example.helloworld3

class Util {
    fun doAction1() {
        doSomeThing()
        println("doing action 1")
    }

    companion object {

        @JvmStatic
        fun doAction2() {
            doSomeThing()
            println("doing action 2")
        }
    }
}