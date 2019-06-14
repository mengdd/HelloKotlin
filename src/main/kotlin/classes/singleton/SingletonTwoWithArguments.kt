package classes.singleton

class SingletonTwoWithArguments private constructor(
    private val name: String,
    private val age: Int
) {
    companion object {
        private var instance: SingletonTwoWithArguments? = null

        fun getInstance(name: String, age: Int) =
            instance ?: SingletonTwoWithArguments(name, age).also { instance = it }
    }

    override fun toString(): String {
        return "SingletonTwoWithArguments${hashCode()}(name='$name', age=$age)"
    }
}

fun main() {
    val instance1 = SingletonTwoWithArguments.getInstance("hello", 1)
    println(instance1)
    val instance2 = SingletonTwoWithArguments.getInstance("world", 2)
    println(instance2)
    val instance3 = SingletonTwoWithArguments.getInstance("ddmeng", 30)
    println(instance3)
}