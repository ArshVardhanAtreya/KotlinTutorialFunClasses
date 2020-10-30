package `class`

/**
 * The class declaration consists of the class name, the class header (specifying its type parameters,
 * the primary constructor etc.) and the class body, surrounded by curly braces.
 * Both the header and the body are optional; if the class has no body, curly braces can be omitted.
 * */

class Customer

// Declares a class named Customer without any properties or user-defined constructors.
// A non-parameterized default constructor is created by Kotlin automatically.

class Contact(val id: Int, var email: String)
// Declares a class with two properties: immutable id and mutable email, and a constructor with two parameters id and email.

fun main() {

    val customer = Customer()
    // Creates an instance of the class Customer via the default constructor. Note that there is no new keyword in Kotlin.

    val contact = Contact(1, "arsh@gmail.com")
    // Creates an instance of the class Contact using the constructor with two arguments.

    println(contact.id)                                // Accesses the property id.
    contact.email = "arshvardhan@gmail.com"            // Updates the value of the property email.
    println(contact.email)                             // Accesses the property email.
}






