package classes.singleton

class SingletonFive private constructor() {
    companion object {
        val instance: SingletonFive by lazy {
            println("lazy body")
            SingletonFive()
        }
    }
}

fun main() {
    val instance1 = SingletonFive.instance
    println(instance1)
    val instance2 = SingletonFive.instance
    println(instance2)
    val instance3 = SingletonFive.instance
    println(instance3)
}