package ru.frechman.exercises.stepik;

import java.io.IOException;
import java.io.InputStream;

public class m5_2_8 {
    public static int checkSumOfStream(InputStream inputStream) throws IOException {

        int checkSum = 0;
        int buff;

        while ((buff = inputStream.read()) != -1) {
            checkSum = Integer.rotateLeft(checkSum, 1) ^ buff;
        }
        return checkSum;
    }
}
