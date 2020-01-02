package classes.property

fun main() {
    val car = Car()
    car.speed = "50"
    println(car.speed)
}

class Car {
    var speed: String = "0"
        get() = "$field km/h"
}