package collections

/**
 * A list is an ordered collection of items.
 * In Kotlin, lists can be either mutable (MutableList) or read-only (List).
 * For list creation, use the standard library functions listOf() for read-only lists and
 * mutableListOf() for mutable lists. To prevent unwanted modifications,
 * obtain read-only views of mutable lists by casting them to List.
 * */

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)        // Creates a MutableList.
val sudoers: List<Int> =
    systemUsers                              // Creates a read-only view of the list.

fun addSudoer(newUser: Int) {                                     // Adds a new item to the MutableList.
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {                                  // A function that returns an immutable List.
    return sudoers
}

fun main() {
    addSudoer(4)                                        // Updates the MutableList. All related read-only views are updated as well since they point to the same object.
    println("Tot sudoers: ${getSysSudoers().size}")               // Retrieves the size of the read-only list.
    getSysSudoers().forEach {                                     // Iterates the list and prints its elements.
            i ->
        println("Some useful info on user $i")
    }
    // getSysSudoers().add(5) <- Error!                           // Attempting to write to the read-only view causes a compilation error.
}








