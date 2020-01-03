package classes.property

fun main() {
    val user = User(
        mapOf(
            "name" to "John Doe",
            "age" to 25
        )
    )
    println(user.name)
    println(user.age)
}

class User(map: Map<String, Any?>) {
    val name by map
    val age by map
}