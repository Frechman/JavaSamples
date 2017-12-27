package ru.frechman.exercises;

public class Test {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 2;
        //a = a + b - (b = a);
        System.out.println(b ^ 5);

        System.out.println(sumOfRecursive(2));
    }


    public static int sumOfRecursive(int n) {
        if (n == 0) {
            return 0;
        } else return n + sumOfRecursive(n - 1);
    }
}
