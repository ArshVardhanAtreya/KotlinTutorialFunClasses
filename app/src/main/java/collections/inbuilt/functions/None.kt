package collections.inbuilt.functions

/**
 * Function none returns true if there are no elements that match the given predicate in the collection.
 * */

fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)    // Defines a collection of numbers.

    val allEven =
        numbers.none { it % 2 == 1 }   // Checks if there are no odd elements (all elements are even).

    val allLess6 = numbers.none { it > 6 }       // Checks if there are no elements greater than 6.

    println("Numbers: $numbers")
    println("All numbers are even: $allEven")
    println("No element greater than 6: $allLess6")
}



