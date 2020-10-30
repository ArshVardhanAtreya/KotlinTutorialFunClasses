package scope.functions

/**
 * To help choose the right scope function, here is the table of key differences between them.
 * -------------------------------------------------------------------------------------------
 * Function	    Object reference	Return value	Is extension function
 * --------    -----------------    ------------    ---------------------
 * let	        it	                Lambda result	Yes
 * run	        this	            Lambda result	Yes
 * run	        -	                Lambda result	No: called without the context object
 * with	        this	            Lambda result	No: takes the context object as an argument.
 * apply	    this	            Context object	Yes
 * also	        it	                Context object	Yes
 *
 * Here is a short guide for choosing scope functions depending on the intended purpose:
 * - Executing a lambda on non-null objects: 'let'
 * - Introducing an expression as a variable in local scope: 'let'
 * - Object configuration: 'apply'
 * - Object configuration and computing the result: 'run'
 * - Running statements where an expression is required: non-extension 'run'
 * - Additional effects: 'also'
 * - Grouping function calls on an object: 'with'

 * The Kotlin standard library function 'let' can be used for scoping and null-checks.
 * When called on an object, let executes the given block of code and returns the result of its last expression.
 * The object is accessible inside the block by the reference it.
 * */


fun customPrint(s: String) {
    print(s.toUpperCase())
}

fun main() {
    val empty =
        "test".let {               // Calls the given block on the result on the string "test".
            customPrint(it)                    // Calls the function on "test" by the it reference.
            it.isEmpty()                       // let returns the value of this expression.
        }
    println(" is empty: $empty")


    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        str?.let {                         // Uses safe call, so let and its code block will be executed only on non-null values.
            print("\t")
            customPrint(it)
            println()
        }
    }
    printNonNull(null)
    printNonNull("my string")
}

//data class Person(var name: String, var age: Int, var city: String) {
//    fun moveTo(newCity: String) { city = newCity }
//    fun incrementAge() { age++ }
//}
//
//fun main() {
//    Person("Alice", 20, "Amsterdam").let {
//        println(it)
//        it.moveTo("London")
//        it.incrementAge()
//        println(it)
//    }
//}