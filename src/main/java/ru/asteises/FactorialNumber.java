package main.java.ru.asteises;

public class FactorialNumber {

    public static void main(String[] args) {
        System.out.println(classicSolution(5));
        System.out.println(recursionSolution(5));
    }

    public static Integer classicSolution(int x) {
        int factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static Integer recursionSolution(int x) {
        if (x <= 0) {
            return 1;
        } else {
            return x * recursionSolution(x - 1);
        }
    }
}
