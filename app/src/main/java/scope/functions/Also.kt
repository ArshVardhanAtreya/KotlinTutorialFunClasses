package scope.functions

/**
 * also works like apply: it executes a given block and returns the object called.
 * Inside the block, the object is referenced by it, so it's easier to pass it as an argument.
 * This function is handy for embedding additional actions, such as logging in call chains.
 * */

data class User(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writeCreationLog(user: User) {
    println("A new user ${user.name} was created.")
}

fun main() {
   User(
       "Jake",
       30,
       "Android developer"
   )   // Creates a User() object with the given property values.
        .also {                   // Applies the given code block to the object. The return value is the object itself.
            writeCreationLog(it)  // Calls the logging function passing the object as an argument.
        }
}



