package classes.property

import kotlin.properties.Delegates


fun main() {
    val person = Person()
    person.name = "first"
    person.name = "second"
    person.age = 1
}

class Person {
    var name: String by Delegates.observable("<no name>") { prop, old, new ->
        println("${prop.name}: $old -> $new")
    }
    var age: Int by Delegates.observable(0, onChange =
    { property, oldValue, newValue ->
        println("${property.name}: $oldValue -> $newValue")
    })
}