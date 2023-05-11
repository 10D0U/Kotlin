package chapter2_oop.p5_functions;

public class VarArgs {
    static int addAll(Integer...numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(addAll(2, 9, 8, 1));
        System.out.println(addAll(2, 2, 8, 1, 3, 1));
    }
}
