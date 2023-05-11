package chapter3_oop_concepts.p2_iheritance

fun main() {
    val myCat = Cat()
}
open class Animal() {
    var type: String = "Mammal"
    var legs: Int = 4

    init {
        println("Parent Animal class constructor")
    }
}

class Cat: Animal() {
    init {
        println("Child Cat class constructor")
    }
}

