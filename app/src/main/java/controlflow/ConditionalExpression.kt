package controlflow

/**
 * There is no ternary operator condition ? then : else in Kotlin.
 * Instead, if may be used as an expression:
 * */


fun main() {
    fun max(a: Int, b: Int) = if (a > b) a else b  // if is an expression here: it returns a value.

    println(max(99, -42))
}