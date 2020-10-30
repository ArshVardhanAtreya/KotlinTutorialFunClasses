package collections.inbuilt.functions

/**
 * Function any returns true if the collection contains at least one element that matches the given predicate.
 * */

fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)        // Defines a collection of numbers.
    val anyNegative = numbers.any { it < 0 }         // Checks if there are negative elements.
    val anyGT6 = numbers.any { it > 6 }              // Checks if there are elements greater than 6.

    println("Numbers: $numbers")
    println("Is there any number less than 0: $anyNegative")
    println("Is there any number greater than 6: $anyGT6")
}



