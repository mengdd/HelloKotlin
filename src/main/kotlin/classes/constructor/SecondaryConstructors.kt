package classes.constructor

class Constructors {
    init {
        println("Init block")
    }

    constructor(i: Int) {
        println("Constructor")
    }
}

fun main() {
    Constructors(1)
}