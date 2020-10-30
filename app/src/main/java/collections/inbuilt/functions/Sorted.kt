package collections.inbuilt.functions

/**
 * sorted returns a list of collection elements sorted according to their natural sort order (ascending).
 * sortedBy sorts elements according to natural sort order of the values returned by specified selector function.
 * */

import kotlin.math.abs

fun main() {

    val shuffled =
        listOf(5, 4, 2, 1, 3, -10)                   // Defines a collection of shuffled numbers.
    val natural = shuffled.sorted()                             // Sorts it in the natural order.
    val inverted =
        shuffled.sortedBy { -it }                    // Sorts it in the inverted natural order by using -it as a selector function.
    val descending =
        shuffled.sortedDescending()                // Sorts it in the inverted natural order by using sortedDescending.
    val descendingBy =
        shuffled.sortedByDescending { abs(it) } // Sorts it in the inverted natural order of items' absolute values by using abs(it) as a selector function.

    println("Shuffled: $shuffled")
    println("Natural order: $natural")
    println("Inverted natural order: $inverted")
    println("Inverted natural order by absolute value: $descending")
    println("Inverted natural order of absolute values: $descendingBy")
}





