package interop

class StaticMethodsDemoClass {
    companion object {
        fun sayHello() {
            println("hello")
        }

        @JvmStatic
        fun sayHelloStatic() {
            println("hello")
        }
    }
}

object SingletonObject {
    fun sayWorld() {
        println("world")
    }

    @JvmStatic
    fun sayWorldStatic() {
        println("world")
    }
}