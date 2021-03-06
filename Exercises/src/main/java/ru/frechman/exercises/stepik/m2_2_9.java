package ru.frechman.exercises.stepik;

public class m2_2_9 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(128));
    }

    /**
     * Checks if given <code>value</code> is a power of two.
     *
     * @param value any number
     * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
     */
    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }
}
