package basics.nullsafety


fun main(args: Array<String>) {
    nullSafetyBasics()
    safeCallWithLet()
    notNullAssertion()
    safeCasts()
    collectionFilter()
}

private fun nullSafetyBasics() {
    var a: String = "abc"
    // a = null // compile error
    val aLength = a.length

    var b: String? = "abc"
    b = null // ok
    // val bLength = b.length // 不能直接使用, compile error
    val bLength = b?.length // 如果b不为null, 返回长度, 如果b为null, 返回null

    println("$aLength, $bLength")
}

private fun safeCallWithLet() {
    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item?.let { println(it) } // prints A and ignores null
    }
}

private fun notNullAssertion() {
    var c: String? = "ha ha"

    val cLength = c!!.length
    println(cLength)

    c = null
    // print(c!!.length) // throws kotlin.KotlinNullPointerException
}

private fun safeCasts() {
    val a = "Str"
    val aInt: Int? = a as? Int //aInt will be null since a is not Int

    println(aInt)
}

private fun collectionFilter() {
    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()

    println(nullableList)
    println(intList)
}