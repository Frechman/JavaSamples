package ru.frechman.exercises.hexlet.generics;

import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        final Tuple<Integer, String> tp = new Tuple<>(1, "sdf");
        Main main = new Main();
        main.sing(new ManSinger("MAx"));
        System.out.println(
                Main.<Integer>max(Collections.singletonList(1))
        );
    }

    public <T extends Human & ISinger> void sing(T pevec) {
        System.out.printf("%s Sing for you: ", pevec.getName());
        pevec.sing();
    }

    public static <T extends Number> T max(Collection<T> c) {
        return (T) new Integer(10);
    }

}
