package chapter2_oop.p6_functions

fun main() {
    val number: Int = 8

    val result1 = number.minValue(9)
    val result2 = number minValue 4

    println(result1)
    println(result2)
}

infix fun Int.minValue(number: Int) : Int = if (this < number) this else number