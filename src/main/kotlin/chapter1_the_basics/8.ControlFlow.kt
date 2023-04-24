package chapter1_the_basics

fun main() {
    var x = 6
    var y = 3
    var z = 8

    if (x > y) {
        println("$x is greater than $y.")
    } else {
        println("$x is less than $y.")
    }

    var greater: Int
    if (x > z) {
        greater = x
    } else {
        greater = z
    }
    println("$greater is greater number.")

    /**
     * if as expression
     */
    var result = if (y > z) y else z
    println("Result is $result.")

    var color = "green"
    when (color) {
        "red" -> println("Stop")
        "yellow" -> println("Slow down")
        "green" -> println("Go")
        else -> println("Something wrong!")
    }

    /**
     * when as expression
     */
    var mark = 2
    var grade = when (mark) {
        1 -> "Worst"
        2 -> "Poor"
        3 -> "Fair"
        4 -> "Good"
        5 -> "Great"
        else -> "Error"
    }
    println("You got $grade in this exam.")

    var day = "Friday"
    when(day) {
        "Sunday" -> {
            println("Today is Sunday.")
            println("Movie Night!!")
        }
        "Saturday" -> {
            println("Today is Saturday.")
            println("Let's party tonight!!")
        }
        else -> {
            println("Weekday...")
            println("We have to go to work:(")
        }
    }

    when (day) {
        "Sunday", "Saturday" -> println("It is holiday.")
        "Monday", "Tuesday" -> println("So so boring.")
        "Thurday", "Wednesday" -> println("A lot of work to do.")
        else -> println("TGIF")
        }
}