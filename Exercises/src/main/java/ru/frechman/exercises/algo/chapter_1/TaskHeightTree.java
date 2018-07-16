package ru.frechman.exercises.algo.chapter_1;

import java.util.Arrays;
import java.util.Scanner;

public class TaskHeightTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        // TODO:
        System.out.println(length);
        System.out.println(Arrays.toString(arr));
    }
}
