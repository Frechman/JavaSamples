package ru.frechman.exercises.stepik;

import java.io.IOException;

public class m5_2_9 {

    public static void main(String... args) throws IOException {

        int curr_buf = System.in.read(); //текущий байт
        int buffByte; // читаем

        while (curr_buf != -1 & (buffByte = System.in.read()) != -1) {

            if (curr_buf == 13 && buffByte == 10) {
                curr_buf = buffByte;
                continue;
            }

            System.out.write(curr_buf);
            curr_buf = buffByte;
        }
        if (curr_buf != -1) {
            System.out.write(curr_buf);
        }
        System.out.flush();
    }
}
