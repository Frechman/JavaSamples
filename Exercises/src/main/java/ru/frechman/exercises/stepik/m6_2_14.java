package ru.frechman.exercises.stepik;

import java.util.LinkedHashSet;
import java.util.Set;

//https://stepik.org/lesson/12776/step/14
//Реализуйте метод, вычисляющий симметрическую разность двух множеств.
//Симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.
public class m6_2_14 {
    public static void main(String[] args) {

    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> buffSet = new LinkedHashSet<>(set1);
        Set<T> resultSet = new LinkedHashSet<>(set1);
        buffSet.retainAll(set2);
        resultSet.addAll(set2);
        resultSet.removeAll(buffSet);
        return resultSet;
    }
}
