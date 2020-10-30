package scope.functions

/**
 * The Kotlin standard library contains several functions whose sole purpose is to
 * execute a block of code within the context of an object. When we call such a function
 * on an object with a lambda expression provided, it forms a temporary scope. In this scope,
 * you can access the object without its name. Such functions are called scope functions.
 * There are five of them: let, run, with, apply, and also.
 *
 *
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
 **/

/**
 * The Kotlin standard library function 'let' can be used for scoping and null-checks.
 * When called on an object, let executes the given block of code and returns the result of its last expression.
 * The object is accessible inside the block by the reference it.
 * */

data class People(var name: String, var age: Int, var city: String) {
    fun moveTo(newCity: String) {
        city = newCity
    }

    fun incrementAge() {
        age++
    }
}

fun main() {
    People("Arsh", 30, "Bangalore").let {
        println(it)
        it.moveTo("Delhi")
        it.incrementAge()
        println(it)
    }
}