package delegation

/**
 * The Kotlin standard library contains a bunch of useful delegates, like lazy, observable, and others.
 * You may use them as is. For example 'lazy' is used for lazy initialization.
 * */

class LazySample {
    init {
        println("created!")            // Property lazy is not initialized on object creation.
    }

    val lazyStr: String by lazy {
        println("computed!")
        "my lazy"
    }
    // The first call to get() executes the lambda expression passed to lazy() as an argument
    // and saves the result.
}

fun main() {
    val sample = LazySample()         // Property lazy is not initialized on object creation.
    println("lazyStr = ${sample.lazyStr}")
    println(" = ${sample.lazyStr}")  // Further calls to get() return the saved result.
}