package scope.functions

/**
 * 'apply' executes a block of code on an object and returns the object itself.
 * Inside the block, the object is referenced by 'this'.
 * This function is handy for initializing objects.
 * */

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun main() {
    val arsh =
        Person()                       // Creates a Person() instance with default property values.
    val stringDescription = arsh.apply {  // Applies the code block (next 3 lines) to the instance.
        name = "Arsh"                     // Inside apply, it's equivalent to arsh.name = "Arsh".
        age = 30
        about = "Android developer"
    }
        .toString()                       // The return value is the instance itself.
    println(stringDescription)
}





