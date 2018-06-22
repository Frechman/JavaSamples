package ru.frechman.exercises.hexlet.collections;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LinkedListImplTest {

    @Test
    public void whenSizeZero() {
        List<Integer> linkedList = new LinkedListImpl<>();
        assertEquals(0, linkedList.size());
    }

    @Test
    public void whenArrIsEmptyThenTrue() {
        List<Integer> linkedList = new LinkedListImpl<>();
        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void whenArrNotIsEmptyThenFalse() {
        List<Integer> linkedList = new LinkedListImpl<>();
        linkedList.add(1);
        assertFalse(linkedList.isEmpty());
    }

    @Test
    public void whenArrContainsNumber() {
        List<Integer> linkedList = new LinkedListImpl<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        assertTrue(linkedList.contains(2));
    }

    @Test
    public void whenArrNotContainsNumber() {
        List<Integer> linkedList = new LinkedListImpl<>();
        linkedList.add(111);
        linkedList.add(10);
        linkedList.add(3);
        assertFalse(linkedList.contains(1));
    }


}