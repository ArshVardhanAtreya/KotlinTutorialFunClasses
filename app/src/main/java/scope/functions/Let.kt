package scope.functions

/**
 * The Kotlin standard library function let can be used for scoping and null-checks.
 * When called on an object, let executes the given block of code and returns the result of its last expression.
 * The object is accessible inside the block by the reference it.
 * */


fun customPrint(s: String) {
    print(s.toUpperCase())
}

fun main() {
    val empty =
        "test".let {               // Calls the given block on the result on the string "test".
            customPrint(it)                    // Calls the function on "test" by the it reference.
            it.isEmpty()                       // let returns the value of this expression.
        }
    println(" is empty: $empty")


    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        str?.let {                         // Uses safe call, so let and its code block will be executed only on non-null values.
            print("\t")
            customPrint(it)
            println()
        }
    }
    printNonNull(null)
    printNonNull("my string")
}