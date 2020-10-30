package collections.inbuilt.functions

/**
 * These functions return the first and the last element of the collection correspondingly.
 * You can also use them with a predicate; in this case,
 * they return the first or the last element that matches the given predicate.
 * If a collection is empty or doesn't contain elements matching the predicate,
 * the functions throw NoSuchElementException.
 * */

fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)            // Defines a collection of numbers.

    val first = numbers.first()                          // Picks the first element.
    val last = numbers.last()                            // Picks the last element.
    val firstEven = numbers.first { it % 2 == 0 }        // Picks the first even element.
    val lastOdd = numbers.last { it % 2 != 0 }           // Picks the last odd element.

    println("Numbers: $numbers")
    println("First $first, last $last, first even $firstEven, last odd $lastOdd")
}






