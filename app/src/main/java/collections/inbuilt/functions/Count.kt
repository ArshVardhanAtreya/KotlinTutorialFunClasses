package collections.inbuilt.functions

/**
 * count functions returns either the total number of elements in a collection
 * or the number of elements matching the given predicate.
 * */

fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)            // Defines a collection of numbers.
    val totalCount = numbers.count()                     // Counts the total number of elements.
    val evenCount = numbers.count { it % 2 == 0 }        // Counts the number of even elements.

    println("Total number of elements: $totalCount")
    println("Number of even elements: $evenCount")
}



