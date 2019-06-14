package classes.singleton

class SingletonTwo private constructor() {
    companion object {
        private var instance: SingletonTwo? = null

        fun getInstance() =
            instance ?: SingletonTwo().also { instance = it }
    }
}

fun main() {
    val instance1 = SingletonTwo.getInstance()
    println(instance1)
    val instance2 = SingletonTwo.getInstance()
    println(instance2)
    val instance3 = SingletonTwo.getInstance()
    println(instance3)
}