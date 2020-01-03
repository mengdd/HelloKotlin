package classes.property

fun main() {
    println(lazyValue)
    println(lazyValue)
    println(lazyValue)
}

val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}