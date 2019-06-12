package classes.constructor

class Person constructor(firstName: String) {
//...
}

class Person2(firstName: String) {
//...
}

class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

class PersonWithProperties(val firstName: String, val lastName: String, var age: Int) {
//    ...
}

fun main() {
    InitOrderDemo("hello world")
}