package chapter3_oop_concepts.p2_iheritance

open class Vehicle() {
    constructor(speed: Int, numOfWheels: Int) : this()
}

class Car(): Vehicle()

class AnotherCar(var horsePower: Int, var wheels: Int) : Vehicle(horsePower, wheels)