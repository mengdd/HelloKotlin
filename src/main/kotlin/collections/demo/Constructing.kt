package collections.demo

fun main() {
    // set
    val numbersSet = setOf("one", "two", "three", "four")
    val numbersSetMutable = mutableSetOf("one", "two", "three", "four")
    val emptySet = emptySet<String>()

    // list
    val numbersList = listOf("one", "two", "three", "four")
    val numbersListMutable = mutableListOf("one", "two", "three", "four")
    val emptyList = emptyList<String>()

    // map
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    val numbersMapMutable = mutableMapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    val emptyMap = emptyMap<String, Int>()

}

