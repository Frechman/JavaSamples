package ru.frechman.exercises.stepikAlt;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOddNumberTest {

    @Test
    public void sumOfOddNumbersInRange() {
        assertEquals(3 + 5 + 7 + 9 + 11 + 13, SumOddNumber.sumOfOddNumbersInRange(3, 13));
    }
}