package functions

/**
 * Kotlin lets you add new members to any class with the extensions mechanism.
 * Namely, there are two types of extensions: extension functions and extension properties.
 * They look a lot like normal functions and properties but with one important difference:
 * you need to specify the type that you extend.
 * */



data class Item(val name: String, val price: Float)  // Defines simple models of Item and Order. Order can contain a collection of Item objects.

data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxBy { it.price }?.price ?: 0F    // Adds extension functions for the Order type.
fun Order.maxPricedItemName() = this.items.maxBy { it.price }?.name ?: "NO_PRODUCTS"

val Order.commaDelimitedItemNames: String                                             // Adds an extension property for the Order type.
    get() = items.map { it.name }.joinToString()

fun main() {

    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))

    println("Max priced item name: ${order.maxPricedItemName()}")                     // Calls extension functions directly on an instance of Order.
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")                                // Accesses the extension property on an instance of Order.

}