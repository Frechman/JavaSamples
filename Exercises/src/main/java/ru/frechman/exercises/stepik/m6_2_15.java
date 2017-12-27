package ru.frechman.exercises.stepik;

import java.util.LinkedList;
import java.util.Scanner;

//https://stepik.org/lesson/12776/step/15
public class m6_2_15 {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextInt()) {
                sc.nextInt();
                if (sc.hasNextInt()) {
                    numbers.push(sc.nextInt());
                }
            }
        }

        numbers.forEach((n) -> System.out.print(n + " "));
    }
}
