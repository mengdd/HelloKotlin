package classes.property

import kotlin.properties.Delegates

fun main() {
    val child = Child()

    println("try a negative age")
    child.age = -3
    println("age is: ${child.age}")
    println("try a positive age")
    child.age = 5
    println("age is: ${child.age}")
}

class Child {
    var age: Int by Delegates.vetoable(0) { property, oldValue, newValue ->
        println("${property.name}: $oldValue -> $newValue")
        newValue > 0
    }
}