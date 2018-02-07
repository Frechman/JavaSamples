package ru.frechman.exercises.stepickAlt;

import java.util.stream.LongStream;

public class SumOddNumber {

    public static long sumOfOddNumbersInRange(long start, long end) {
        return LongStream.rangeClosed(start, end).filter(x -> x % 2 != 0).sum();
    }

}
