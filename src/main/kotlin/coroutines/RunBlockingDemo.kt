package coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    // start main coroutine
    GlobalScope.launch {
        // launch a new coroutine in background and continue
        delay(1000L)
        println("World! + ${Thread.currentThread().name}")
    }
    println("Hello, + ${Thread.currentThread().name}") // main coroutine continues here immediately
    delay(2000L) // delaying for 2 seconds to keep JVM alive
}