package chapter2_oop.p7_functions

fun show() {
    println("This is first")
    second()
    println("This is third")
}
inline fun second() {
    println("This is second.")
}

fun main() {
    show()
}