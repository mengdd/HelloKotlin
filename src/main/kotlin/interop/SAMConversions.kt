package interop

// java function, java interface parameter
private fun trySAM1() {
    JavaUtils.calculate(2, 3) { number1, number2 -> number1 + number2 }
}

// kotlin function, kotlin interface parameter
private fun trySAM2() {
    calculate2(2, 3, object : Operation2 {
        override fun doCalculate(left: Int, right: Int): Int {
            return left + right
        }
    })
}

// kotlin function, function type parameter
private fun trySAM3() {
    calculate3(2, 3) { number1, number2 -> number1 + number2 }
}

// kotlin function, java interface parameter
private fun trySAM4() {
    calculate4(2, 3, JavaUtils.Operation { left, right -> left + right })
}

interface Operation2 {
    fun doCalculate(left: Int, right: Int): Int
}

fun calculate2(firstNumber: Int, secondNumber: Int, operation: Operation2): Int {
    return operation.doCalculate(firstNumber, secondNumber)
}

fun calculate3(firstNumber: Int, secondNumber: Int, operation: (Int, Int) -> Int): Int {
    return operation.invoke(firstNumber, secondNumber)
}

fun calculate4(firstNumber: Int, secondNumber: Int, operation: JavaUtils.Operation): Int {
    return operation.doCalculate(firstNumber, secondNumber)
}