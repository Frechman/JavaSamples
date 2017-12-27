package ru.frechman.exercises.stepik;

public class m4_1_10 {

    public static void main(String[] args) {

    }

    public static String getCallerClassAndMethodName() {
        if (new Throwable().getStackTrace().length < 3) {
            return null;
        }
        return new Throwable().getStackTrace()[2].getClassName() + "#" + new Throwable().getStackTrace()[2].getMethodName();
    }
}
