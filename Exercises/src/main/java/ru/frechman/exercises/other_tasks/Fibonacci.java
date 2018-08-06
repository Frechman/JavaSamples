package ru.frechman.exercises.other_tasks;

import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] args) {

        fibonacci(11);
    }

    public static void fibonacci(int n) {
        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;
        BigInteger sum = first.add(second);
        for (int i = 0; i < n; i++) {
            System.out.print(sum + " ");
            sum = first.add(second);
            first = second;
            second = sum;
        }
    }
}
