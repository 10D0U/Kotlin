package chapter2_oop.p4_functions;

public class UseDefaultArgumentFunction {
    public static void main(String[] args) {
        DefaultArgumentsKt.transfer(10000.00, "Pocket Money");
        DefaultArgumentsKt.transfer(50000.00);

        transferMoney(3000.00);
        transferMoney(6000.00, "Total Cost");
    }

    static void transferMoney(double amount) {
        System.out.println("Amount is " + amount);
    }

    static void transferMoney(double amount, String notes) {
        System.out.println("Amount is " + amount);
        System.out.println(notes);
    }
}
