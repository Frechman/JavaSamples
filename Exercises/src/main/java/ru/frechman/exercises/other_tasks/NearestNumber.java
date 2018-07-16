package ru.frechman.exercises.other_tasks;

public class NearestNumber {

    /**
     * The method finds the nearest number from the array to the specify number.
     *
     * @param number specify.
     * @param array  of different numbers.
     * @return nearest number from the array to the number.
     */
    public static int getNearestNumber(int number, int... array) {
        int nearestNumber = array[0];
        int min = Math.abs(number - array[0]);
        for (int i = 1; i < array.length; i++) {
            if (Math.abs(number - array[i]) < min) {
                min = Math.abs(number - array[i]);
                nearestNumber = array[i];
            }
        }
        return nearestNumber;
    }
}
