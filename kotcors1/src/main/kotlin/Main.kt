package org.example

import kotlinx.coroutines.*

fun main() {
    runBlocking {
        /*
        runBlocking runs in an event loop.
         */
        print("Kotlin ")
        delay(1000)
        println("Coroutines")
    }
}
