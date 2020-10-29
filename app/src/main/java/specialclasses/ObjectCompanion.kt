package specialclasses

/**
 * An object declaration inside a class defines another useful case: the companion object.
 * Syntactically it's similar to the static methods in Java:
 * you call object members using its class name as a qualifier.
 * If you plan to use a companion object in Kotlin,
 * consider using a package-level function instead.
 * */

class Cheer {                        //Defines a class.
    companion object CheerWords {    //Defines a companion. Its name can be omitted.

        fun getCheers(nTimes: Int) { //Defines a companion object method.
            for (i in 1 .. nTimes) {
                println("HIP HIP HURREY ")
            }
        }
    }
}

fun main() {
    Cheer.getCheers(5)      //Calls the companion object method via the class name.
}



