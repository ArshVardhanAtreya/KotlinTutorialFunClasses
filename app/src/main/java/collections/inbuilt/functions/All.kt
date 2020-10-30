package collections.inbuilt.functions

/**
 * Function all returns true if all elements in collection match the given predicate.
 * */


fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)        // Defines a collection of numbers.
    val allEven = numbers.all { it % 2 == 0 }        // Checks whether all elements are even.
    val allLess6 = numbers.all { it < 6 }            // Checks whether all elements are less than 6.

    println("Numbers: $numbers")
    println("All numbers are even: $allEven")
    println("All numbers are less than 6: $allLess6")
}



