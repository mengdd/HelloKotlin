package collections.demo

fun main() {
    // set
    val numbersSet = setOf("one", "two", "three", "four")
    val numbersSetMutable = mutableSetOf("one", "two", "three", "four")

    // list
    val numbersList = listOf("one", "two", "three", "four")
    val numbersListMutable = mutableListOf("one", "two", "three", "four")

    // map
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    val numbersMapMutable = mutableMapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

    useEmptyCollections()

    passReference()
    copyList()
}

fun useEmptyCollections() {
    val emptySet = emptySet<String>()
    val emptyList = emptyList<String>()
    val emptyMap = emptyMap<String, Int>()
}

fun passReference() {
    val sourceList = mutableListOf(1, 2, 3)
    val referenceList: List<Int> = sourceList
//referenceList.add(4)            //compilation error
    sourceList.add(4)
    println(sourceList)
    println(referenceList) // shows the current state of sourceList
}

fun copyList() {
    val sourceList = mutableListOf(1, 2, 3)
    val copyList = sourceList.toList()
    sourceList.add(4)
    println(sourceList)
    println(copyList) // is different from current sourceList
}