package ru.frechman.exercises.stepik;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class m5_3_12 {

    public static void main(String[] args) throws IOException {
        Charset charset = StandardCharsets.US_ASCII;

        byte[] array = {48, 49, 50, 51};
        InputStream inputStream = new ByteArrayInputStream(array);

        String str = readAsString(inputStream, charset);
        System.out.println(str);
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();
        try (Reader reader = new InputStreamReader(inputStream, charset)) {

            int read;
            while ((read = reader.read()) != -1) {
                stringBuilder.append((char) read);
            }
        }

        return stringBuilder.toString();
    }
}
