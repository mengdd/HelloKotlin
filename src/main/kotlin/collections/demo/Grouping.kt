package collections.demo

import collections.models.Book
import collections.models.books

fun main() {
    val booksGroupByAuthor = getBooksGroupByAuthor(books)
    println(booksGroupByAuthor)
    println("Group size: ${booksGroupByAuthor.size}")

    val associateByAuthor = books.associateBy { it.author }
    println(associateByAuthor)
    println("Associate size: ${associateByAuthor.size}")
}

fun getBooksGroupByAuthor(books: List<Book>): Map<String, List<Book>> {
    return books.groupBy { it.author }
}