package ru.cource.lesson;

class Calculate {
    public static void main(String[] args) {
        System.out.println("Calculate....");

        int first = Integer.valueOf(args[0]);
        int second = Integer.valueOf(args[1]);

        int sum = first + second;
        int difference = first - second;
        int multiply = first * second;
        double divideFirstOnSecond = first / second;
        double divideSecondOnFirst = second / first;
        double powFirst = first * first;
        double powSecond = second * second;

        System.out.println("sum = " + sum);
        System.out.println("difference = " + difference);
        System.out.println("multiply = " + multiply);
        System.out.println("divideFirstOnSecond = " + divideFirstOnSecond);
        System.out.println("divideSecondOnFirst = " + divideSecondOnFirst);
        System.out.println("powFirst = " + powFirst);
        System.out.println("powSecond = " + powSecond);

        int result = powFirstOnSecond(first, second);
        System.out.println("Число " + first + " в степени " + second + " равно = " + result);
        result = powerFirstToSecond(second, first);
        System.out.println("Число " + second + " в степени " + first + " равно = " + result);

    }

    public static int powerFirstToSecond(int first, int second) {
        int result = 1;
        for (int i = 0; i < second; i++) {
            result *= first;
        }
        return result;
    }

    public static int powFirstOnSecond(int first, int second) {
        int result = 1;
        if (second != 1) {
            result *= powFirstOnSecond(first, second - 1);
        }
        return result;
    }
}