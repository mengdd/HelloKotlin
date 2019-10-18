package collections.demo

import collections.models.books

fun main() {

    val authors = setOf("Eric Carle", "Karen Katz")

    findBookNamesOfAuthorsUsingCollection(authors)

    println("using sequence -----------------------------")
    findBookNamesOfAuthorsUsingSequence(authors)
}

fun findBookNamesOfAuthorsUsingCollection(authors: Set<String>): List<String> {
    return books
        .filter {
            println("filter: $it")
            it.author in authors
        }
        .map {
            println("map: $it")
            it.name
        }
        .take(3)
}

fun findBookNamesOfAuthorsUsingSequence(authors: Set<String>): List<String> {
    return books
        .asSequence()
        .filter {
            println("filter: $it")
            it.author in authors
        }
        .map {
            println("map: $it")
            it.name
        }
        .take(3)
        .toList()
}