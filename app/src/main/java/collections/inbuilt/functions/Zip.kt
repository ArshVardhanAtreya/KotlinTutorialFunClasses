package collections.inbuilt.functions

/**
 * zip function merges two given collections into a new collection.
 * By default, the result collection contains Pairs of source collection elements with the same index.
 * However, you can define own structure of the result collection element.
 * The size of the result collection equals to the minimum size of a source collection.
 * */


fun main() {

    val A = listOf("a", "b", "c")
    val B = listOf(1, 2, 3, 4)                     // Defines two collections.

    val resultPairs =
        A zip B                      // Merges them into a list of pairs. The infix notation is used here.
    val resultReduce =
        A.zip(B) { a, b -> "$a$b" } // Merges them into a list of String values by the given transformation.

    println("A to B: $resultPairs")
    println("\$A\$B: $resultReduce")
}



