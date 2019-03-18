package basics.controlflow

fun main(args: Array<String>) {
    ifAsExpression()
    whenUsage()
    loopWithFor()
}

private fun ifAsExpression() {
    var a = 1
    var b = 2
    // As expression
    val max = if (a > b) a else b
    println(max)

    val min = if (a < b) {
        print("Choose a")
        a
    } else {
        print("Choose b")
        b
    }
    println(min)
}

private fun whenUsage() {
    var x = 1
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> { // Note the block
            print("x is neither 1 nor 2")
        }
    }
}

private fun loopWithFor() {
    val list = mutableListOf<String>()

    list.add("a")
    list.add("b")
    list.add("c")

    for (s in list) {
        println(s)
    }
}