package chapter1_the_basics

fun main() {
    val name = "Calvin"
    val age = 13

    /**
     * In Java
     */
    println("My name is " + name + " and I am " + age + " years old.")

    /**
     * In Kotlin
     */
    println("My name is $name and I am $age years old.")

    println("My name is ${name.uppercase()} and I am ${age+3} years old.")
}