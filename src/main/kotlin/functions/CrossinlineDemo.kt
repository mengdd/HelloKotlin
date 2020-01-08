package functions


fun main() {

    fooNormal {
        println("body 1")
        // return // return is not allowed here
        return@fooNormal
    }
    fooWithCrossinline {
        println("body 3")
        // return // return is not allowed here
        return@fooWithCrossinline
        // if fooWithCrossinline is not marked with inline
        // if body is marked with crossinline
    }
    fooInline {
        println("body 2")
        return
    }

    println("the end of main")
}


fun fooNormal(body: () -> Unit) {
    println("normal start")
    body()
    println("normal done")
}

inline fun fooInline(body: () -> Unit) {
    println("inline start")
    body()
    println("inline done")
}

inline fun fooWithCrossinline(crossinline body: () -> Unit) {
    println("with crossinline start")
    body()
    println("with crossinline done")
}