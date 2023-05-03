package chapter2_oop.p2_functions

import chapter2_oop.p1_classes_objects.Car

fun main() {
    basicFunction()
    circleArea(0.7)
    val result = sum(45, 89)
    println("Result: $result")
    println("Area of square: ${squareArea(4)}")
}

// Create functions in Kotlin
fun basicFunction() {
    println("This is basic function.")
}

fun circleArea(radius: Double) {
    println("Area of circle: ${Math.PI * radius * radius}")
}

fun sum(number1: Int, number2: Int): Int {
    return number1 + number2
}

/**
 * Function as Expression
 */
fun squareArea(length: Int) = length.times(length)

fun printCar() = Car().info()

fun carBrand() = Car().brand

fun carName() = Car().name

fun carPrice() = Car().price

fun carName2(): String? = Car().name

