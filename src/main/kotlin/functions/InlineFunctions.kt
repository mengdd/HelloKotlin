package functions


fun main() {
    sayHi {
        println("I'm wind, what's your name?")
    }
}

inline fun sayHi(body: () -> Unit) {
    println("Hi, ")
    body()
    println("Bye!")
}

