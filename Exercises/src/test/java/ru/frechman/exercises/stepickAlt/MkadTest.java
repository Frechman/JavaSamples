package ru.frechman.exercises.stepickAlt;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MkadTest {

    @Test
    public void one() {
        assertEquals(11, Mkad.getDistance(60, 2));
    }

    @Test
    public void two() {
        assertEquals(108, Mkad.getDistance(-1, 1));
    }

    @Test
    public void getS() {
        assertEquals(0, Mkad.getDistance(109, 1));
    }

    @Test
    public void test2() {
        assertEquals(0, Mkad.getDistance(109, 1));

    }

    @Test
    public void test3() {
        assertEquals(0, Mkad.getDistance(109, 10));

    }

    @Test
    public void test4() {
        assertEquals(0, Mkad.getDistance(-109, 10));
    }

    @Test
    public void test5() {
        assertEquals(47, Mkad.getDistance(-990, 1000));
    }

    @Test
    public void test6() {
        assertEquals(0, Mkad.getDistance(108, 109));
    }

    @Test
    public void test11() {
        assertEquals(0, Mkad.getDistance(-108, 109));
    }

    @Test
    public void test7() {
        assertEquals(2, Mkad.getDistance(107, 108));
    }

    @Test
    public void test8() {
        assertEquals(0, Mkad.getDistance(109, 108));
    }
}