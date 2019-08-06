package classes.singleton

class SingletonSix private constructor() {
    companion object {
        private lateinit var instance: SingletonSix
        fun getInstance(): SingletonSix {
            synchronized(this) {
                if (!::instance.isInitialized) {
                    instance = SingletonSix()
                }
            }
            return instance
        }
    }
}


fun main() {
    val instance1 = SingletonSix.getInstance()
    println(instance1)
    val instance2 = SingletonSix.getInstance()
    println(instance2)
    val instance3 = SingletonSix.getInstance()
    println(instance3)
}