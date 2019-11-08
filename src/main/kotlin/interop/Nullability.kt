package interop


fun main() {
    getStringFromJava()
}

private fun getStringFromJava() {
    val stringOne = JavaUtils.getStringOne()
    println(stringOne)
    println(stringOne.length)
    val stringTwo = JavaUtils.getStringTwo()
    println(stringTwo)
    println(stringTwo?.length)
}
