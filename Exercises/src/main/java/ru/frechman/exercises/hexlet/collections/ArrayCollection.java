package ru.frechman.exercises.hexlet.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class ArrayCollection<T> implements Collection<T> {

    private T[] arr = (T[]) new Object[10];

    public ArrayCollection() {
    }

    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator();
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(arr, size);
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        Object[] newArr = new Object[size];
        System.arraycopy(arr, 0, newArr, 0, size);
        return (T1[]) newArr;
    }

    @Override
    public boolean add(T t) {
        T[] oldArr = arr;
        if (arr.length == size) {
            arr = (T[]) new Object[size * 2];
            System.arraycopy(oldArr, 0, arr, 0, size);
        }
        arr[size++] = t;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i].equals(o)) {
                if (i != size - 1) {
                    System.arraycopy(arr, i + 1, arr, i, size - i - 1);
                }
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        for (T e : c) {
            this.add(e);
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean result = false;
        for (Object o : c) {
            result = this.remove(o);
        }
        return result;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        for (Object o : this) {
            if (!c.contains(o)) {
                this.remove(o);
            }
        }
        return true;
    }

    @Override
    public void clear() {
        arr = (T[]) new Object[10];
        size = 0;
    }

    private final class ArrayIterator implements Iterator<T> {

        private int size;

        @Override
        public boolean hasNext() {
            return ArrayCollection.this.size() > size;
        }

        @Override
        public T next() {
            return ArrayCollection.this.arr[size++];
        }
    }
}
