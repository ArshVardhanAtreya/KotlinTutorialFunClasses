package specialclasses

/**
 * Here is a basic typical usage of an object expression: a simple object/properties structure.
 * There is no need to do so in class declaration: you create a single object,
 * declare its members and access it within one function.
 * Objects like this are often created in Java as anonymous class instances.
 * */

fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {  //Creates a function with parameters.

    val dayRates = object {                                                     //Creates an object to use when calculating the result value.
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special       //Accesses the object's properties.

    print("Total price: $$total")                                               //Prints the result.

}

fun main() {
    rentPrice(10, 2, 1)                   //Calls the function. This is when the object is actually created.
}