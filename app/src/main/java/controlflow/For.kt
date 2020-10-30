package controlflow

/**
 * Kotlin supports all the commonly used loops: for, while, do-while.
 * 'for' in Kotlin works the same way as in most languages.
 * */


fun main(args: Array<String>) {
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {                               // Loops through each cake in the list.
        println("Yummy, it's a $cake cake!")
    }

}
