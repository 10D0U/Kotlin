package chapter2_oop.p1_classes_objects

class Car {
    val id = 1
    val brand = "Ford"
    val model = "Civic"
    val name: String? = null
    val price = 26450

    fun info() {
        println("""
            ID : $id
            Car brand : $brand
            Car model : $model
            Car price : $price$
        """.trimMargin())
    }
}

fun main() {
    val myCar = Car()
    println(myCar.id)
    println(myCar.name)
    println(myCar.brand)
    println(myCar.model)
    println(myCar.price)

    myCar.info()
}