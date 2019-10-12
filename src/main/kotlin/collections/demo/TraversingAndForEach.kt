package collections.demo

import collections.models.books

fun main() {
    way1()

    way2()

    way3()

    way4()
}

private fun way1() {
    for (book in books) {
        println(book.name)
    }
}

private fun way2() {
    books.forEach { println(it.name) }
}

private fun way3() {
    val iterator = books.iterator()
    while (iterator.hasNext()) {
        println(iterator.next().name)
    }
}

private fun way4() {
    for (i in books.indices) {
        println(books[i].name)
    }
}
