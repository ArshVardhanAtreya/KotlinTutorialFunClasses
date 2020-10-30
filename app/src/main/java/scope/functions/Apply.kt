package scope.functions

/**
 * apply executes a block of code on an object and returns the object itself.
 * Inside the block, the object is referenced by this.
 * This function is handy for initializing objects.
 * */

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun main() {
    val jake =
        Person()                   // Creates a Person() instance with default property values.
    val stringDescription = jake.apply {  // Applies the code block (next 3 lines) to the instance.
        name = "Jake"                     // Inside apply, it's equivalent to jake.name = "Jake".
        age = 30
        about = "Android developer"
    }
        .toString()                          // The return value is the instance itself, so you can chain other operations.
    println(stringDescription)
}





