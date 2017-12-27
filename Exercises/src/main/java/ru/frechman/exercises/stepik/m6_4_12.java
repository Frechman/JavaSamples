package ru.frechman.exercises.stepik;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class m6_4_12 {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        T[] list = (T[]) stream.sorted(order).toArray();
        //Arrays.sort(list);
        if (list.length > 0) {

            minMaxConsumer.accept(list[0], list[list.length - 1]);
        } else {
            minMaxConsumer.accept(null, null);
        }
    }
}
