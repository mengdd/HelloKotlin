package classes.objects

open class A(x: Int) {
    public open val y: Int = x
}

interface B {
// ...
}

val ab: A = object : A(1), B {
    override val y = 15
}

fun foo() {
    val adHoc = object {
        var x: Int = 0
        var y: Int = 0
    }
    print(adHoc.x + adHoc.y)
}