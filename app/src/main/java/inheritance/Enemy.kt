package inheritance

open class Enemy(var name: String, var hitPoints: Int, var lives: Int) {
// Kotlin classes are final by default.
// If you want to allow the class inheritance, mark the class with the open modifier.

    open fun takeDamage(damage: Int) {
        // Kotlin methods are also final by default.
        // As with the classes, the open modifier allows overriding them.
        val remainingHitPoints = hitPoints - damage
        if (remainingHitPoints > 0) {
            hitPoints = remainingHitPoints
            println("$name took $damage points of damage, and has $hitPoints left")
        } else {
            lives -= 1
            if (lives > 0) {
                println("$name lost a life")
            } else {
                println("No lives left, $name is dead")
            }
        }
    }

    override fun toString(): String {
        return "Name: $name, Hitpoints: $hitPoints, Lives: $lives"
    }
}