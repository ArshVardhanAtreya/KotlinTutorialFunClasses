package collections.inbuilt.functions

/**
 * These functions work almost the same way with one difference:
 * they return null if there are no matching elements.
 * */

fun main() {

    val words = listOf("foo", "bar", "baz", "faz")         // Defines a collection of words.
    val empty = emptyList<String>()                        // Defines an empty collection.

    val first =
        empty.firstOrNull()                        // Picks the first element from empty collection. It supposed to be null.
    val last =
        empty.lastOrNull()                          // Picks the last element from empty collection. It supposed to be null as well.

    val firstF =
        words.firstOrNull { it.startsWith('f') }  // Picks the first word starting with 'f'.
    val firstZ =
        words.firstOrNull { it.startsWith('z') }  // Picks the first word starting with 'z'.
    val lastF = words.lastOrNull { it.endsWith('f') }      // Picks the last word ending with 'f'.
    val lastZ = words.lastOrNull { it.endsWith('z') }      // Picks the last word ending with 'z'.

    println("First $first, last $last")
    println("First starts with 'f' is $firstF, last starts with 'z' is $firstZ")
    println("First ends with 'f' is $lastF, last ends with 'z' is $lastZ")
}








