package chapter1_the_basics

fun main() {
    val oneToeight = 1..8
    val cTom = 'c'..'m'

    println(oneToeight)
    println(cTom)

    var x = 7
    println(x.rangeTo(18))

    for (y in 1.rangeTo(9)) {
        print(y)
    }

    for (num in oneToeight) {
        print("$num ")
    }

    println("")

    for (char in 'c'..'i') {
        print("$char ")
    }

    println("")

    val xInclude = 'x' in cTom
    println(xInclude)

    val rnotInclude = 'r' !in cTom
    println(rnotInclude)

    var sixteenToFour = 16 downTo 4
    var twentyToten = 20 downTo (10)
    println("$sixteenToFour")
    println("$twentyToten")

    for (i in 20 downTo 14) {
        print("$i ")
    }

    println("")

    var threeUntilTwelve = 3 until 12
    println(threeUntilTwelve)

    for (j in 4 until 19) {
        print("$j ")
    }

    println("")

    var oneToFifteenStep3 = 1..15 step 3
    println(oneToFifteenStep3)

    for (k in 4..24  step 4) {
        print("$k ")
    }

    println("")

    var thirtyToten = 30..10 step 5
    println(thirtyToten)
}