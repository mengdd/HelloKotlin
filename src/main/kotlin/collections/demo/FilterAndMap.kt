package collections.demo

import collections.models.Book
import collections.models.books


fun main() {
    // filter and count
    val booksOfEric = getBooksOfAuthor(books, "Eric Carle")
    println("Books by Eric Carle: $booksOfEric")
    println("Books by Eric Carle: list size = ${booksOfEric.size}")
    println("Books by Eric Carle: count = ${getBooksCountOfAuthor(books, "Eric Carle")}")

    // filter and map
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

fun getBooksCountOfAuthor(books: List<Book>, author: String): Int {
    return books.count { it.author == author }
}