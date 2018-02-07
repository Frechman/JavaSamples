package ru.frechman.exercises.calc;

public class Assert {

    public static void assertEquals(String msg, int expected, int actual) {
        if (expected != actual) {
            System.out.println(msg + " - Test failed!");
        } else {
            System.out.println(msg + " - Test passed!");
        }
    }

    public static void assertEquals(String msg, double expected, double actual) {
        if (Math.abs(expected - actual) > 1e-5) {
            System.out.println(msg + " - Test failed!");
        } else {
            System.out.println(msg + " - Test passed!");
        }
    }

    public static void assertEquals(String msg, String expected, String actual) {
        if (!expected.equals(actual)) {
            System.out.println(msg + " - Test failed!");
        } else {
            System.out.println(msg + " - Test passed!");
        }
    }
}