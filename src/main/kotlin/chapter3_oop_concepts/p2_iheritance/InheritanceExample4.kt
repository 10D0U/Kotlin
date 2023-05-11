package chapter3_oop_concepts.p2_iheritance

open class Vehicle1 {
    constructor(speed: Int, numOfWheels: Int)
}

class Car1(var horsePower: Int, var wheels: Int) : Vehicle1(horsePower, wheels)