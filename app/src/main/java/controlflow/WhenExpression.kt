package controlflow


fun main() {
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyOwnClass()))
}

fun whenAssign(obj: Any): Any {
    return when (obj) {                    // This is a when expression.
        1 -> "one"                         // Sets the value to "one" if obj equals to one.
        "Hello" -> 1                       // Sets the value to one if obj equals to Hello.
        is Long -> false                   // Sets the value to false if obj is an instance of Long.
        else -> 42
        // Sets the value "42" if none of the previous conditions are satisfied.
        // Unlike in when statement, the default branch is usually required in when expression,
        // except the case when the compiler can check that other branches cover all possible cases.
    }
}

class MyOwnClass





