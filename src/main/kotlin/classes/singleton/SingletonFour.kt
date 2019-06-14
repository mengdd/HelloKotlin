package classes.singleton

class SingletonFour private constructor() {
    companion object {
        @Volatile
        private var instance: SingletonFour? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: SingletonFour().also { instance = it }
            }
    }
}

fun main() {
    val instance1 = SingletonFour.getInstance()
    println(instance1)
    val instance2 = SingletonFour.getInstance()
    println(instance2)
    val instance3 = SingletonFour.getInstance()
    println(instance3)
}