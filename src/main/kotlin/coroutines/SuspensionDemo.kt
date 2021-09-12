package coroutines

import kotlinx.coroutines.suspendCancellableCoroutine
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

//Demo for https://kt.academy/article/cc-suspension

suspend fun main() {
//    demo1()
    userDemoV2()

}

suspend fun demo1() {
    println("Before")

    suspendCoroutine<Unit> { continuation ->
        println("Before too")
    }

    println("After")

// Before
// Before too
}

suspend fun demo2() {
    println("Before")

    suspendCoroutine<Unit> { continuation ->
        continuation.resume(Unit)
    }

    println("After")
// Before
// After
}

suspend fun demo3() {
    println("Before")

    suspendCoroutine<Unit> { continuation ->
        thread {
            Thread.sleep(1000)
            continuation.resume(Unit)
        }
    }

    println("After")
// Before
// (1 second delay)
// After
}


private val executor =
    Executors.newSingleThreadScheduledExecutor {
        Thread(it, "scheduler").apply { isDaemon = true }
    }

suspend fun demo3ImprovedV1() {
    println("Before")

    suspendCoroutine<Unit> { continuation ->
        executor.schedule({
            continuation.resume(Unit)
        }, 1000, TimeUnit.MILLISECONDS)
    }

    println("After")
// Before
// (1 second delay)
// After
}


suspend fun delay(time: Long): Unit =
    suspendCoroutine { cont ->
        executor.schedule({
            cont.resume(Unit)
        }, time, TimeUnit.MILLISECONDS)
    }

suspend fun demo3ImprovedV2() {
    println("Before")

    delay(1000)

    println("After")
// Before
// (1 second delay)
// After
}


data class User(val name: String)
fun requestUser(callback: (User) -> Unit) {
    thread {
        Thread.sleep(1000)
        callback.invoke(User("Test"))
    }
}
suspend fun userDemo() {
    println("Before")
    val user = suspendCoroutine<User> { cont ->
        requestUser { user ->
            cont.resume(user)
        }
    }
    println(user)
    println("After")
}

suspend fun requestUser(): User {
    return suspendCoroutine<User> { cont ->
        requestUser { user ->
            cont.resume(user)
        }
    }
}

suspend fun userDemoV2() {
    println("Before")
    val user = requestUser()
    println(user)
    println("After")
}

//suspend fun requestUserV3(): User {
//    return suspendCancellableCoroutine<User> { cont ->
//        requestUser { resp ->
//            if (resp.isSuccessful) {
//                cont.resume(resp.data)
//            } else {
//                val e = ApiException(
//                    resp.code,
//                    resp.message
//                )
//                cont.resumeWithException(e)
//            }
//        }
//    }
//}