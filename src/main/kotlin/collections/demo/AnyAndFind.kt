package collections.demo

import collections.models.Book
import collections.models.books


fun main() {
    // any and find
    println("Is there any book of Eric Hill? ${hasBookOfAuthor(books, "Eric Hill")}")
    println("Try to find one: ${findOneBookOfAuthor(books, "Eric Hill")}")
    println("Is there any book of Byron Barton? ${hasBookOfAuthor(books, "Byron Barton")}")
    println("Try to find one: ${findOneBookOfAuthor(books, "Byron Barton")}")
}

fun hasBookOfAuthor(books: List<Book>, author: String): Boolean {
    return books.any { it.author == author }
}

fun findOneBookOfAuthor(books: List<Book>, author: String): Book? {
    return books.find { it.author == author }
}