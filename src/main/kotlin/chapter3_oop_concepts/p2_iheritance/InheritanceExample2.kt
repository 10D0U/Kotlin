package chapter3_oop_concepts.p2_iheritance

open class Animal1(var animalType: String, var numOfLegs: Int)

class Cat1: Animal1("Mammal", 4)

class Cat2(type: String, legs: Int): Animal1(type, legs)
