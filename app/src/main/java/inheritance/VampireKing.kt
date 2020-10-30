package inheritance

import Vampire

class VampireKing(name: String) : Vampire(name) {
    // A class inherits a superclass when you specify the : SuperclassName() after its name.

    init {
        hitPoints = 140
    }

    override fun takeDamage(damage: Int) { // Overriding methods or attributes requires the override modifier.
        super.takeDamage(damage / 2)
    }
}