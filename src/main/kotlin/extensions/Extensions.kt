package extensions

import collections.models.Book

fun main() {
    println(checkEvenAndOdd())

    val book = Book("My Car", "Byron Barton")

    println(book.getFullName())
    println(book.nameLength)
    println(book.nullSafeToString())

    val anotherValue: String? = null
    println(anotherValue.nullSafeToString())

}

fun Book.getFullName(): String {
    return this.name + " by " + this.author
}

val Book.nameLength: Int
    get() = this.name.length

fun Book?.nullSafeToString() = this?.toString() ?: "NULL"
fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"

fun checkEvenAndOdd(): List<Boolean> {
    val isEven: Int.() -> Boolean = { this % 2 == 0 }
    val isOdd: Int.() -> Boolean = { this % 2 != 0 }
    return listOf(42.isOdd(), 239.isOdd(), 294823098.isEven())
}