package functions

fun operation(): (Int) -> Int { // Declares a higher-order function that returns a function. (Int) -> Int represents the parameters and return type of the square function.
    return ::square
}

fun square(x: Int) = x * x      // Declares a function matching the signature.

fun main() {
    val func = operation()      // Invokes operation to get the result assigned to a variable.
                                // Here func becomes square which is returned by operation.
    println(func(2))            // Invokes func. The square function is actually executed.
}
