package chapter3_oop_concepts.p1_constructors

fun main() {
    val mgmg = Person7("Mg Mg")
    val naing = Person7("Naing", 29)
    val susu = Person10("Su Su", 17, "Mandalay")
}

class Person7 {
    init {
        println("Initializing Person 7")
    }

    constructor(name: String) {
        println("My name is $name")
    }

    constructor(name: String, age: Int) {
        println("Name is $name and age is $age.")
    }
}

class Person8() {

    constructor(name: String) : this() {
        println("My name is $name")
    }

    constructor(name: String, age: Int) : this() {
        println("Name is $name and age is $age")
    }
}

class Person9(var address: String) {
    init {
        println("Initializing Person 9")
    }


    constructor(age: Int): this("Yangon") {
        println("Address: $address")
    }

    constructor(name: String, age: Int, address: String): this(address) {
        println("Name is $name, age is $age, address is $address")
    }
}

class Person10(var address: String) {
    var name: String = ""
    var age: Int = 1

    init {
        println("Initializing Person 10")
    }

    constructor(age: Int) :this("Yangon") {
        println("Address: $address")
        this.age = age
    }

    constructor(name: String, age: Int, address: String) : this(address) {
        this.name = name
        this.age = age
        println("Name is $name and age is $age.")
    }
}