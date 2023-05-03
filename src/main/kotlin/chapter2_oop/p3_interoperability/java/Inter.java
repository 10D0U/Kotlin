package chapter2_oop.p3_interoperability.java;

import chapter2_oop.p3_interoperability.kotlin.InterOp1Kt;
import chapter2_oop.p3_interoperability.kotlin.Multiply;

public class Inter {
    public static void main(String[] args) {
        System.out.println(InterOp1Kt.areaOfCircle(1.09));

        System.out.println(Multiply.multiply(53, 8));
    }

    public static void printName(String name) {
        System.out.println("My name is " + name + ".");
    }
}
