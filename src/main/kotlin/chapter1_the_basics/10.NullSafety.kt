package chapter1_the_basics

var number = null

/**
 * We can write like this
 */
var username: String? = null

/**
 * We cannot write like this
 */
//var age: Int = null

fun main() {
    var name: String? = "Andrew"
    name = null

    println(name)

    println(name?.length)

    name?.let {
        println("Length of string name: ${name.length}")
    }

    var length = if (name != null) name.length else 0
    println(length)

    var length2 = name?.length ?: 0
    println(length2)

    var quote: String? = "well done"
//    quote = null
    println(quote!!.uppercase())

    var message: String? = null
    println(message!!.length)
}