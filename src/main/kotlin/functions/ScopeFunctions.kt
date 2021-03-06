package functions

fun main() {

    tryThisAndIt()

    println("----------1-----------")
    useLet()
    println("----------2-----------")
    useLet2()
    println("----------3-----------")
    useTakeIf()
}

fun tryThisAndIt() {
    val str: String? = "Hello"
    // this
    str?.run {
        println("run: The receiver string's length is $length")
//        println("run: The receiver string's length is ${this.length}") // does the same
    }

    with(str) {
        println("with: The receiver string's length is ${this?.length}")
    }

    str?.apply {
        println("apply: The receiver string's length is $length")
    }

    // it
    str?.let {
        println("let: The receiver string's length is ${it.length}")
    }
    str?.also {
        println("also: The receiver string's length is ${it.length}")
    }
}

val person1: Person? = null
val person2 = Person("Amy", Pet("Bingo", 2, "Dog"))
val person3 = Person("Mike", Pet(null, 4, "Cat"))

//use apply
val person4 = Person("John").apply {
    pet = Pet().apply {
        name = "Haha"
        age = 1
        type = "Bunny"
    }
}

val person5 = Person("Emily")

fun useLet() {
    printPetName(person1)
    printPetName(person2)
    printPetName(person3)
    printPetName(person4)
    printPetName(person5)
}

fun useLet2() {
    printPetNameOrPrintWhy(person1)
    printPetNameOrPrintWhy(person2)
    printPetNameOrPrintWhy(person3)
    printPetNameOrPrintWhy(person4)
    printPetNameOrPrintWhy(person5)
}

fun useTakeIf() {
    printDogName(person1)
    printDogName(person2)
    printDogName(person3)
    printDogName(person4)
}


fun printPetName(person: Person?) {
    person?.pet?.name?.let { println("pet name is: $it") }
}

fun printPetNameOrPrintWhy(person: Person?) {
    person?.pet?.name?.let { println("pet name is: $it") } ?: println("there is no pet name")
}

fun printDogName(person: Person?) {
    person?.pet?.takeIf { it.type.equals("Dog") }?.name?.let { println("pet name is: $it") }
}

data class Person(val name: String, var pet: Pet? = null)
data class Pet(var name: String? = null, var age: Int? = null, var type: String? = null)