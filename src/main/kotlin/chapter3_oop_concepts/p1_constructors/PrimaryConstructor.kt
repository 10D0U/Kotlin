package chapter3_oop_concepts.p1_constructors

fun main() {
    val mgmg = Person()
    val kyaw = Person6("Kyaw", 19)
    val tun = Person3()
}
class Person {
    init {
        println("This is Person Class initializing.")
    }
}

class Person2() {}

class Person3 constructor() {}

class Person4 private constructor() {}

class Person5 constructor(name: String, age: Int) {
    val name: String
    val age: Int

    init {
        this.name = name
        this.age = age
    }
}

class Person6 constructor(val name: String, val age: Int) {}