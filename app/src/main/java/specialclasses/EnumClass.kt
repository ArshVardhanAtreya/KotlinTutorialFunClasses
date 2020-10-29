package specialclasses

/**
 * Enum classes are used to model types that represent a finite set of distinct values,
 * such as directions, states, modes, and so forth.
 * */

enum class State {
    IDLE, RUNNING, FINISHED                           // Defines a simple enum class with three enum instances. The number of instances is always finite and they are all distinct.
}
/**
 * Enums may contain properties and methods like other classes,
 * separated from the list of instances by a semicolon.
 * */
enum class Color(val rgb: Int) {                      // Defines an enum class with a property and a method.
    RED(0xFF0000),                              // Each instance must pass an argument for the constructor parameter.
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)  // Enum class members are separated from the instance definitions by a semicolon.
}

fun main() {
    val state = State.IDLE                         // Accesses an enum instance via the class name.
    val message = when (state) {                      // With enums, the compiler can infer if a when-expression is exhaustive so that you don't need the else-case.
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)

    val red = Color.RED
    println(red)                                    // The default toString returns the name of the instance, here "RED".
    println(red.containsRed())                      // Calls a method on an enum instance.
    println(Color.BLUE.containsRed())               // Calls a method via enum class name.
}