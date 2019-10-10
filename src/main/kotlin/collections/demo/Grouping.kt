package collections.demo

import collections.models.Book
import collections.models.books

fun main() {
    val booksGroupByAuthor = getBooksGroupByAuthor(books)
    println(booksGroupByAuthor)
    println("Group size: ${booksGroupByAuthor.size}")
}

fun getBooksGroupByAuthor(books: List<Book>): Map<String, List<Book>> {
    return books.groupBy { it.author }
}