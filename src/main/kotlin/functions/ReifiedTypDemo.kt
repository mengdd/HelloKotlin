package functions

fun main() {

    val candidates = listOf(SuperMan(), Hulk(), IronMan(), SuperMan())

    findHero1(candidates, Hulk::class.java)

    findHero2<SuperMan>(candidates)
}

fun <T> findHero1(candidates: List<Hero>, clazz: Class<T>): T? {
    candidates.forEach {
        if (clazz.isInstance(it)) {
            @Suppress("UNCHECKED_CAST")
            return it as T
        }
    }
    return null
}

inline fun <reified T> findHero2(candidates: List<Hero>): T? {
    candidates.forEach {
        if (it is T) {
            return it as T
        }
    }
    return null
}

interface Hero
class SuperMan : Hero
class Hulk : Hero
class IronMan : Hero