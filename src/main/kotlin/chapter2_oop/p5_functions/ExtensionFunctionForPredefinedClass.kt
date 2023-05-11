package chapter2_oop.p5_functions

fun String.fullName(firstName: String, lastName: String) {
    println(this + firstName + lastName)
}

fun Int.addAll(vararg numbers: Int) : Int {
    var sum: Int = 0

    for (num in numbers) {
        sum += num
    }

    return sum
}

fun main() {
    "Mg".fullName("Htet", "Arkar")

    val number = 1
    val result = number.addAll(2, 6, 4, 1)
    val result2 = number.addAll(6, 9, 0, 1, 4, 5)

    println("""
        first Result : $result
        second Result : $result2
        """)
}