package variables

/**
 * Kotlin has powerful type inference. While you can explicitly declare the type of a variable,
 * you'll usually let the compiler do the work by inferring it.
 * Kotlin does not enforce immutability, though it is recommended.
 * In essence use val over var.
 * */

fun main(args: Array<String>) {
    println("Hello World")
    println("My first Kotlin program")

    val pet: String = "Freddy" // Declares an immutable variable and initializes it.
    var arsh = "Arsh"      // Declares a mutable variable and initializes it.

    arsh += "Vardhan"


    println("My pet's name is $pet")
    println("My full name is $arsh")

    val myWeeklySalary =
        32  // Declares an immutable variable and initializes it without specifying the type. The compiler infers the type Int.
    val myMonthlySalary = myWeeklySalary * 4
    println("Arsh's weekly salary is $$myWeeklySalary")
    println("Monthly, that comes to $$myMonthlySalary")

    println()

    val apples = 6
    val oranges = 5
    val fruit = apples - oranges

    println("$apples apples - $oranges oranges leaves $fruit piece(s) of fruit")

    println("A quarter of the apples is ${apples / 4}")

    println()
    val weeks = 234
    val years = weeks / 52.0
    println("$weeks weeks is $years years")

}