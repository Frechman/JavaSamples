package ru.frechman.exercises.stepik;

import java.util.function.DoubleUnaryOperator;

public class m3_5_7 {

    //метод левых прямоугольников

    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));//10.0
        System.out.println(integrate(x -> x + 2, 0, 10));//70.0
        System.out.println(integrate(x -> Math.sin(x) / x, 1, 5));//0.603848
    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {

        double result = 0, h, n;

        n = 1.0E+7;

        h = (b - a) / n; //Шаг сетки

        for (int i = 0; i < n; i++) {
            result += f.applyAsDouble(a + i * h);
        }

        result *= h;

        return result;
    }
}
