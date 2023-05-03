package chapter2_oop.p4_functions

fun main() {
    transfer(350000.00, "Android batch 5")
    transfer(6300.00)

    // Named Arguments
    transfer(notes = "thank you", amount = 30000.00)
}

@JvmOverloads
fun transfer(amount: Double, notes: String = "") {
    println("Amount: $amount MMK")

    if (notes != "") {
        println(notes)
    }
}