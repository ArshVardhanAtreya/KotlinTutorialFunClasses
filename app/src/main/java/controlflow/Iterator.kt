package controlflow

/**
 * You can define your own iterators in your classes by implementing the iterator operator in them.
 * The iterator can be declared in the type or as an extension function.
 * */


class Animal(val name: String)

class Zoo(private val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> { // Defines an iterator in a class. It must be named iterator and have the operator modifier.
        return animals.iterator()
        // Returns the iterator that meets the following method
        // requirements: - next(): Animal | - hasNext(): Boolean
    }
}

fun main() {

    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    for (animal in zoo) {        // Loops through animals in the zoo with the user-defined iterator.
        println("Watch out, it's a ${animal.name}")
    }

}


