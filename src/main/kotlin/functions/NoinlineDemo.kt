package functions

fun main() {
    aMixedInlineFunction({
        println("hehe")
    }, {
        println("haha")
    })
}

inline fun aMixedInlineFunction(inlined: () -> Unit, noinline notInlined: () -> Unit) {
    inlined()
    notInlined()
}