package controlflow

/**
 * Instead of the widely used switch statement,
 * Kotlin provides the more flexible and clear when construction.
 * It can be used either as a statement or as an expression.
 * */

fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any) {
    when (obj) {                                // This is a when statement.
        1 -> println("One")                     // Checks whether obj equals to one.
        "Hello" -> println("Greeting")          // Checks whether obj equals to Hello.
        is Long -> println("Long")              // Performs type checking.
        !is String -> println("Not a string")   // Performs inverse type checking.
        else -> println("Unknown")              // Default statement (might be omitted).
    }
}

class MyClass







