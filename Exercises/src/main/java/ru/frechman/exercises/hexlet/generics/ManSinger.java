package ru.frechman.exercises.hexlet.generics;

public class ManSinger extends Human implements ISinger {
    public ManSinger(String name) {
        super(name);
    }

    @Override
    public void sing() {
        System.out.println("Basssss");
    }
}
