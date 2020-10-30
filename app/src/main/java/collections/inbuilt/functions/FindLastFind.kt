package collections.inbuilt.functions

/**
 * find and findLast functions return the first or the last collection element that matches the given predicate.
 * If there are no such elements, functions return null.
 * */

fun main() {

    val words = listOf(
        "Lets",
        "find",
        "something",
        "in",
        "collection",
        "somehow"
    )  // Defines a collection of words.
    val first =
        words.find { it.startsWith("some") }                         // Looks for the first word starting with "some".
    val last =
        words.findLast { it.startsWith("some") }                      // Looks for the last word starting with "some".
    val nothing =
        words.find { it.contains("nothing") }                      // Looks for the first word containing "nothing".

    println("The first word starting with \"some\" is \"$first\"")
    println("The last word starting with \"some\" is \"$last\"")
    println("The first word containing \"nothing\" is ${nothing?.let { "\"$it\"" } ?: "null"}")
}





