package chapter1_the_basics

import java.lang.reflect.Array
import java.util.*

fun main() {

    // Simple Array
    var arr1 = arrayOf(19, true, "Kotlin", "Java", 'Y')

    // Explicit Array
    var intArr = arrayOf<Int>(4, 701, 89, 9431, 99109)      // Generic
    var intArr2 = arrayOf(7771, 912, 8923213, 22, 5, 9931)

    var mixArr3 = arrayOf(1, 3.32, 0.3, 99, 1000.431)

    var charArr = arrayOf<Char>('I', 'o', 'H', 'P', 'q')
    var charArr2 = arrayOf('S', 'n', 'g', 'T')

    val stringArr = arrayOf<String>("java", "kotlin", "PHP")
    val stringArr2 = arrayOf("Flutter", "dart", "golang")

    // Explicit Array Another Way
    var intArr3 = intArrayOf(6, 99, 341, 9323, 55122)
    var charArr3 = charArrayOf('E', 'q', 'V', 'x', 'z')
    var booleanArr = booleanArrayOf(true, false, 2 != 4, 9 > 19)
    var floatArr = floatArrayOf(9.52f, 0.002f, 45.91f)
    var doubleArr = doubleArrayOf(0.0001, 4444.91, 84.342)

    println(arr1.get(3))
    println(arr1[1])

    arr1.set(1, false)
    arr1[3] = "JavaScript"
//     println(Arrays.toString(arr1))
    println(arr1.contentToString())

    var intInitializeArr = Array<Int>(5){2}
    println(intInitializeArr.contentToString())

    var stringInitializeArr = Array<String>(4) { "Nothing" }
    stringInitializeArr.set(2, "Something")
    println(stringInitializeArr.contentToString())

    var intArr4 = IntArray(4) { i: Int -> i + 4 }
    println(intArr4.contentToString())

    var intArr5 = IntArray(6) { it + 7 }
    println(intArr5.contentToString())

    var intArr6 = Array<Int>(10) { it * 2 }
    println(intArr6.contentToString())

    println(stringArr.contentToString())
    println(stringArr.first())
    println(stringArr.last())
    println(stringArr.size)
    println(stringArr.reversed())


    var unsortedIntArr = arrayOf(54, 62, 91, 32, 12, 78)
    println("Before Sorting: ${unsortedIntArr.contentToString()}")
    unsortedIntArr.sort()
    println("After Sorting: ${unsortedIntArr.contentToString()}")

    println("Max Value: ${unsortedIntArr.max()}")
    println("Min Value: ${unsortedIntArr.min()}")
}