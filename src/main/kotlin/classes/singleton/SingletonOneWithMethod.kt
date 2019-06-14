package classes.singleton

object SingletonOneWithMethod {
    private const val age = 20
    fun foo() {
        println(this.hashCode().toString() + " with age $age")
    }
}

fun main() {
    SingletonOneWithMethod.foo()
    SingletonOneWithMethod.foo()
    SingletonOneWithMethod.foo()
}