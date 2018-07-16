package ru.frechman.exercises.stepik;

public class m2_4_9 {
    public static void main(String[] args) {

    }

    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new sorted array containing all elements from a1 and a2
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        int i = 0, j = 0;
        for (int k = 0; k < result.length; k++) {

            if (i > a1.length - 1) {
                result[k] = a2[j++];
            } else if (j > a2.length - 1) {
                result[k] = a1[i++];
            } else {
                result[k] = (a1[i] < a2[j]) ? a1[i++] : a2[j++];
            }

            //изначальный нормальный вариант решения
            /*if (i > a1.length - 1) {   //проверка на выход за пределы массива a1
                result[k] = a2[j];
                j++;
            } else if (j > a2.length - 1) { //проверка на выход за пределы массива a2
                result[k] = a1[i];
                i++;
            } else if (a1[i] < a2[j]) { //сравнение элементов массива
                result[k] = a1[i];
                i++;
            } else {
                result[k] = a2[j];
                j++;
            }*/
        }
        return result;
    }
}
