package collections.inbuilt.functions

/**
 * map extension function enables you to apply a transformation to all elements in a collection.
 * It takes a transformer function as a lambda-parameter.
 * */

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6) // Defines a collection of numbers.
    val doubled = numbers.map { x -> x * 2 }  // Doubles numbers.
    val tripled = numbers.map { it * 3 }      // Uses the shorter it notation to triple the numbers.

    println("Numbers: $numbers")
    println("Doubled Numbers: $doubled")
    println("Tripled Numbers: $tripled")
}



