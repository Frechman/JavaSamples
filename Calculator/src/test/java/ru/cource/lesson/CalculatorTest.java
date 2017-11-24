package ru.cource.lesson;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(1,2);
        assertEquals(3, calculator.getResult());
        calculator.cleanResult();
        calculator.add(10,2);
        assertEquals(12, calculator.getResult());
        calculator.cleanResult();
        calculator.add(0,0);
        assertEquals(0, calculator.getResult());
        calculator.cleanResult();
        calculator.add(-1,2);
        assertEquals(1, calculator.getResult());
        calculator.cleanResult();
        calculator.add(-1,0);
        assertEquals(-1, calculator.getResult());
        calculator.cleanResult();
        calculator.add(-1,-5);
        assertEquals(-6, calculator.getResult());
        calculator.cleanResult();
    }

}