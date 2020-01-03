package classes.property

import kotlin.reflect.KProperty

fun main() {
    val example = DelegateExample()
    example.myProperty = "haha"
    println(example.myProperty)
}

class DelegateExample {
    var myProperty: String by MyDelegate()
}

class MyDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}