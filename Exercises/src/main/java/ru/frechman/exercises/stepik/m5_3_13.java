package ru.frechman.exercises.stepik;

import java.util.Locale;
import java.util.Scanner;

public class m5_3_13 {
    public static void main(String[] args) {

        double sum = 0;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        while (sc.hasNext()) {
            try {
                sum += Double.parseDouble(sc.next());

            } catch (Exception e) {
            }
        }

        System.out.printf("%.6f", sum);
    }
}
