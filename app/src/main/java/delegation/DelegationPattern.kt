package delegation

/**
 * The Delegation pattern has proven to be a good alternative to implementation inheritance,
 * and Kotlin supports it natively requiring zero boilerplate code.
 * A class 'Derived' can implement an interface 'Base' by delegating all of its public members
 * to a specified object.
 * */

interface SoundBehavior {                    // Defines the interface SoundBehavior with one method.
    fun makeSound()
}

class ScreamBehavior(private val n: String) : SoundBehavior {
    override fun makeSound() = println("${n.toUpperCase()} !!!")
}
// The classes ScreamBehavior and RockAndRollBehavior implement
// the interface and contain their own implementations of the method.

class RockAndRollBehavior(private val n: String) : SoundBehavior {
    override fun makeSound() = println("I'm The King of Rock 'N' Roll: $n")
}

class TomAraya(n: String) : SoundBehavior by ScreamBehavior(n)

class ElvisPresley(n: String) : SoundBehavior by RockAndRollBehavior(n)

// The classes TomAraya and ElvisPresley also implement the interface, but not the method.
// Instead, they delegate the method calls to the responsible implementation.
// The delegate object is defined after the by keyword. As you see, no boilerplate code is required.

fun main() {
    val tomAraya = TomAraya("Thrash Metal")
    tomAraya.makeSound()
    val elvisPresley = ElvisPresley("Dancing to the Jailhouse Rock.")
    elvisPresley.makeSound()

    // When makeSound() is called on tomAraya of type TomAraya or elvisPresley of type ElvisPresley,
    // the call is delegated to the corresponding delegate object.
}
