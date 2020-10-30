package controlflow

/**
 * while and do-while constructs work similarly to most languages as well.
 * */

fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")

fun main(args: Array<String>) {
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {           // Executes the block while the condition is true.
        eatACake()
        cakesEaten++
    }

    do {                               // Executes the block first and then checking the condition.
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)

}




