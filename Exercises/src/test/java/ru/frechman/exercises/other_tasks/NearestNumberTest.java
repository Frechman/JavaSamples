package ru.frechman.exercises.other_tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NearestNumberTest {

    @Test
    public void when9ThenNearestNumber5() {
        int actual = NearestNumber.getNearestNumber(9, 1, 2, 3, -4, 5, 15, 25, 35, 55);
        assertEquals(5, actual);
    }

    @Test
    public void whenNegative9ThenNearestNumberNegative4() {
        int actual = NearestNumber.getNearestNumber(-9, 1, 2, 3, -4, 5, 15, 25, 35, 55);
        assertEquals(-4, actual);
    }
}