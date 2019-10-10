package collections.demo

import collections.models.Book
import collections.models.books


fun main() {
    val booksOfEric = getBooksOfAuthor(books, "Eric Carle")
    println("Books by Eric Carle: ${booksOfEric.size}")

    val booksNamesOfSeuss = getBooksNamesOfAuthor(books, "Dr. Seuss")
    println("Books by Dr. Seuss: $booksNamesOfSeuss")
}

fun getBooksOfAuthor(books: List<Book>, author: String): List<Book> {
    return books.filter { it.author == author }
}

fun getBooksNamesOfAuthor(books: List<Book>, author: String): List<String> {
    return books
        .filter { it.author == author }
        .map { it.name }
}