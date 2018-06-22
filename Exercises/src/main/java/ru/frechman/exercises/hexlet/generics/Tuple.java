package ru.frechman.exercises.hexlet.generics;

public class Tuple<T1, T2> {

    private final T1 left;

    public void setRight(T2 right) {
        this.right = right;
    }

    private T2 right;

    public Tuple(final T1 left, final T2 right) {
        this.left = left;
        this.right = right;
    }

    public T1 getLeft() {
        return left;
    }

    public T2 getRight() {
        return right;
    }


}
