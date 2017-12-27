package ru.frechman.exercises.stepik;

import java.util.stream.IntStream;

//https://stepik.org/lesson/12781/step/11
public class m6_4_11 {
    public static void main(String[] args) {

    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> n * n / 10 % 1000);
    }
}
