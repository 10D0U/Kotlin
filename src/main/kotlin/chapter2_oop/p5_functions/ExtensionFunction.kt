package chapter2_oop.p5_functions

class ExtensionFunction {
    fun calcPerimeter(radius: Double) {
        println("Perimeter of radius $radius circle: ${2 * Math.PI * radius}")
    }
}

fun ExtensionFunction.calcArea(radius: Double) {
    println("Area of radius $radius circle: ${Math.PI * radius * radius}")
}

fun main() {
    val circle = ExtensionFunction()
    circle.calcArea(0.86)
    circle.calcPerimeter(0.45)
}