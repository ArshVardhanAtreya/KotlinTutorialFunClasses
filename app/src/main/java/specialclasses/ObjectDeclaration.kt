package specialclasses

/**
 * You can also use the object declaration. It isn't an expression,
 * and can't be used in a variable assignment.
 * You should use it to directly access its members
 * */

object DoAuth {                                                 //Creates an object declaration.
    fun takeParams(username: String, password: String) {        //Defines the object method.
        println("input Auth parameters = $username:$password")
    }
}

fun main(){
    DoAuth.takeParams("arshvardhan", "123456")     //Calls the method. This is when the object is actually created.
}