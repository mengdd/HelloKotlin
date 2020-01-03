package classes.property

import kotlin.properties.ReadOnlyProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun main() {
    val student = Student()
    println(student.name)
    println(student.score)
}

class Student {
    val name: String by MyCoolDelegate()
    var score: Int by MyAwesomeDelegate()
}

class MyCoolDelegate : ReadOnlyProperty<Student, String> {
    override fun getValue(thisRef: Student, property: KProperty<*>): String {
        return "John"
    }
}

class MyAwesomeDelegate : ReadWriteProperty<Student, Int> {
    override fun getValue(thisRef: Student, property: KProperty<*>): Int {
        return 3
    }

    override fun setValue(thisRef: Student, property: KProperty<*>, value: Int) {
    }
}