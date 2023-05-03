package chapter2_oop.p3_interoperability.kotlin

import chapter2_oop.p3_interoperability.java.Inter

fun areaOfCircle(radius: Double) = Math.PI * radius * radius

fun main() {
    Inter.printName("Fred")

    val area1 = areaOfCircle(0.71)
    println("Area of circle is $area1.")
}