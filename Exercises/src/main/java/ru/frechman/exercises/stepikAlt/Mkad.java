package ru.frechman.exercises.stepikAlt;

import java.util.Scanner;

public class Mkad {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int time = scanner.nextInt();

        System.out.println(Mkad.getDistance(v, time));
    }

    public static int getDistance(int v, int time) {
        return v >= 0 ? Math.abs(v * time) % 109 : Math.abs(109 - Math.abs(v * time) % 109) % 109;
    }

}
