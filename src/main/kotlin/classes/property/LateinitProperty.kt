package classes.property

fun main() {
    val someClass = PropertyDemo()
    if (someClass.isPropertyAInitialized()) {
        println(someClass.propertyA)
    }
}

class PropertyDemo {
    lateinit var propertyA: String
    fun isPropertyAInitialized() = ::propertyA.isInitialized
}
