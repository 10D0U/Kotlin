package chapter1_the_basics

fun main() {
    /**
     * Numbers
     */
    val number1: Byte = 127
    val number2: Short = 32767
    val number3: Int = 2147483647
    val number4: Long = 9223372036854775807
    val number5: Float = 28.6f
    val number6: Double = 128.823

    /**
     * Characters
     */
    val letter: Char = 'H'

    /**
     * Boolean
     */
    val isMarried: Boolean = false

    /**
     * String
     */
    val name: String = "Gaben"

    // raw String
    var message = """
        Good morning,
        Mrs. $name""".trimMargin()

    println(message)

    var num1 = 12
    var num2 = 73
    println("The sum of $num1 and $num2 is ${num1+num2}.")

    println("The length of my name is ${name.length}.")

    /**
     * Array
     */

    val arr1 = arrayOf(2, 7, 2, 9, 0)
    val arr2: Array<Int> = arrayOf(8, 1, 5, 4, 8)
}
