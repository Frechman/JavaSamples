package ru.frechman.exercises.algo.chapter_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskCheckBracketsTest {


    @Test
    public void chek10() {
        String actual = TaskCheckBrackets.checkBrackets("{{");
        String exp = "2";
        assertEquals(exp, actual);
    }

    @Test
    public void chek11() {
        String actual = TaskCheckBrackets.checkBrackets("{}");
        String exp = "Success";
        assertEquals(exp, actual);
    }

    @Test
    public void chek12() {
        String actual = TaskCheckBrackets.checkBrackets("");
        String exp = "Success";
        assertEquals(exp, actual);
    }

    @Test
    public void chek13() {
        String actual = TaskCheckBrackets.checkBrackets("}");
        String exp = "1";
        assertEquals(exp, actual);
    }

    @Test
    public void chek1() {
        String actual = TaskCheckBrackets.checkBrackets("s{}");
        String exp = "Success";
        assertEquals(exp, actual);
    }

    @Test
    public void chek2() {
        String actual = TaskCheckBrackets.checkBrackets("{{{**[][][]");
        String exp = "3";
        assertEquals(exp, actual);
    }

    @Test
    public void checkBrackets() {
        String actual = TaskCheckBrackets.checkBrackets("([](){([])})");
        String expected = "Success";
        assertEquals(expected, actual);
    }

    @Test
    public void checkBrackets44() {
        String actual = TaskCheckBrackets.checkBrackets("{}([]");
        String expected = "3";
        assertEquals(expected, actual);
    }

    @Test
    public void checkBrackets1() {
        String actual = TaskCheckBrackets.checkBrackets("()[]}");
        String expected = "5";
        assertEquals(expected, actual);
    }

    @Test
    public void checkBrackets2() {
        String actual = TaskCheckBrackets.checkBrackets("{{[()]]");
        String expected = "7";
        assertEquals(expected, actual);
    }

    @Test
    public void checkBrackets3() {
        String actual = TaskCheckBrackets.checkBrackets("{{{[][][]");
        String expected = "3";
        assertEquals(expected, actual);
    }

    @Test
    public void checkBrackets4() {
        String actual = TaskCheckBrackets.checkBrackets("{*{{}");
        String expected = "3";
        assertEquals(expected, actual);
    }

    @Test
    public void checkBrackets5() {
        String actual = TaskCheckBrackets.checkBrackets("[[*");
        String expected = "2";
        assertEquals(expected, actual);
    }

    @Test
    public void checkBrackets6() {
        String actual = TaskCheckBrackets.checkBrackets("{*}");
        String expected = "Success";
        assertEquals(expected, actual);
    }

    @Test
    public void checkBrackets7() {
        String actual = TaskCheckBrackets.checkBrackets("{{");
        String expected = "2";
        assertEquals(expected, actual);
    }
}