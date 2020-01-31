package dsl.html

fun main() {
    print(simpleOne())
//    print(result())
}

fun simpleOne() = html {
    head {
        title { +"HTML encoding with Kotlin" }
    }
    body {
        h1 { +"Kotlin" }
        p {
            +"Hello World"
        }
    }
}

fun result() =
    html {
        head {
            title { +"HTML encoding with Kotlin" }
        }
        body {
            h1 { +"HTML encoding with Kotlin" }
            p {
                +"this format can be used as an"
                +"alternative markup to HTML"
            }

            // an element with attributes and text content
            a(href = "http://jetbrains.com/kotlin") { +"Kotlin" }

            // mixed content
            p {
                +"This is some"
                b { +"mixed" }
                +"text. For more see the"
                a(href = "http://jetbrains.com/kotlin") {
                    +"Kotlin"
                }
                +"project"
            }
            p {
                +"some text"
                for (i in 1..5)
                    +"${i}*2 = ${i * 2}"
            }
        }
    }