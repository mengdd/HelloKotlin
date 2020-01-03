package classes.property

fun main() {
    val car = Car()
    car.name = ""
    car.speed = "50"
    println(car.name)
    println(car.speed)
}

class Car {
    var speed: String = "0"
        get() = "$field km/h"

    var name: String = "no name set"
        get() = "the car's name is: $field"
        set(value) {
            if (value.isNotEmpty()) {
                field = value
            }
        }
}