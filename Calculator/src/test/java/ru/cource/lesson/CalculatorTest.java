package ru.cource.lesson;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(1, 2);

        assertEquals(3, calculator.getResult());
        //calculator.cleanResult();
        calculator.add(10, 2);
        assertEquals(15, calculator.getResult());
        calculator.cleanResult();

        calculator.add(0, 0);
        assertEquals(0, calculator.getResult());
        calculator.cleanResult();

        calculator.add(-1, 2);
        assertEquals(1, calculator.getResult());
        calculator.cleanResult();

        calculator.add(-1, 0);
        assertEquals(-1, calculator.getResult());
        calculator.cleanResult();

        calculator.add(-1, -5);
        assertEquals(-6, calculator.getResult());
        calculator.cleanResult();
    }

    @Test
    public void testDiff() throws Exception {
        Calculator calc = new Calculator();
        calc.cleanResult();
        assertEquals(0, calc.getResult());

        calc.difference(15, 3);
        assertEquals(12, calc.getResult());
        calc.cleanResult();

        calc.difference(5, -10);
        assertEquals(15, calc.getResult());

        calc.difference(5, -5, 10);
        assertEquals(0, calc.getResult());

        calc.difference(0, -20);
        assertEquals(20, calc.getResult());

        calc.difference(-10, 35);
        assertEquals(-45, calc.getResult());

        calc.difference(-5);
        assertEquals(-5, calc.getResult());

        calc.difference(5, 10);
        assertEquals(-5, calc.getResult());
    }


    @Test
    public void testMultiply() throws Exception {
        Calculator calculator = new Calculator();
        calculator.multiply(8, 9, 0);
        assertEquals(0, calculator.getResult());


        calculator.multiply(5, 100);
        assertEquals(0, calculator.getResult());

    }


}