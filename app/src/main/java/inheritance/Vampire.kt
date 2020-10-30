import inheritance.Enemy

open class Vampire(name: String) : Enemy(name, 20, 3) {
    // If you want to use a parameterized constructor of the superclass when creating a subclass,
    // provide the constructor arguments in the subclass declaration.
    override fun takeDamage(damage: Int) { // Overriding methods or attributes requires the override modifier.
        super.takeDamage(damage / 2)
    }
}