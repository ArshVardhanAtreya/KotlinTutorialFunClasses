package scope.functions

/**
 * Like let, run is another scoping function from the standard library.
 * Basically, it does the same: executes a code block and returns its result.
 * The difference is that inside run the object is accessed by this.
 * This is useful when you want to call the object's methods rather than pass it as an argument.
 * */

fun main() {
    fun getNullableLength(ns: String?) {
        println("for \"$ns\":")
        ns?.run {                                 // Calls the given block on a nullable variable.
            println("\tis empty? " + isEmpty())   // object's members are accessed without its name.
            println("\tlength = $length")
            println(this)
            length                                // run returns the length of String.
        }
    }
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")
}
