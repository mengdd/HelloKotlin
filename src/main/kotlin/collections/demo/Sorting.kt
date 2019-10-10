package collections.demo

import collections.models.Book
import collections.models.books

fun main() {

    val booksSortedByName = sortBooksByName(books)
    val booksSortedByNameLength = sortBooksByNameLength(books)
    val booksSortedByComparator = sortBooksByComparator(books)
    println("original books: ")
    println(books)
    println("sorted books by name")
    println(booksSortedByName)
    println("sorted books by name length: ")
    println(booksSortedByNameLength)
    println("sorted books by Comparator: ")
    println(booksSortedByComparator)
}


fun sortBooksByName(books: List<Book>): List<Book> {
    return books.sortedBy { it.name }
}

fun sortBooksByNameLength(books: List<Book>): List<Book> {
    return books.sortedBy { it.name.length }
}

fun sortBooksByComparator(books: List<Book>): List<Book> {
    return books.sortedWith(
        Comparator { book1, book2 ->
            return@Comparator book1.name.length - book2.name.length
        }
    )
}