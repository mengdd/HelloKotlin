package collections.demo

import collections.models.Book
import collections.models.Student
import collections.models.students

fun main() {
    // map
    println(getBooksListsOrderedByStudent(students[1]))
    // flatMap
    println(getBooksOrderedByStudent(students[1]))
    println(getAllBooksOrderedByAllStudents(students))
}


fun getBooksListsOrderedByStudent(student: Student): Set<List<Book>> {
    return student.orders.map { it.books }.toSet()
}

fun getBooksOrderedByStudent(student: Student): Set<Book> {
    return student.orders.flatMap { it.books }.toSet()
}

fun getAllBooksOrderedByAllStudents(students: List<Student>): Set<Book> {
    return students.flatMap { student ->
        student.orders.flatMap { order ->
            order.books
        }
    }.toSet()
}