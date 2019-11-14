package coroutines

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    // @coroutine#1
    println(Thread.currentThread().name)
    val deferred: Deferred<Int> = async {
        // @coroutine#2
        loadData()
    }
    println("waiting..." + Thread.currentThread().name)
    println(deferred.await()) // suspend @coroutine#1
}

suspend fun loadData(): Int {
    println("loading..." + Thread.currentThread().name)
    delay(1000L) // suspend @coroutine#2
    println("loaded!" + Thread.currentThread().name)
    return 42
}