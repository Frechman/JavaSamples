package ru.frechman.exercises.stepik;

import java.math.BigInteger;

public class m2_4_8 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        BigInteger ret = BigInteger.ONE;
        for (int i = 1; i <= value; ++i) {
            ret = ret.multiply(BigInteger.valueOf(i));
        }
        return ret;

        // your implementation here
    }
}
