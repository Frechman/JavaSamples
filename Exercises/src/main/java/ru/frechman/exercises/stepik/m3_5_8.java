package ru.frechman.exercises.stepik;


import java.util.Arrays;

public class m3_5_8 {


    class AsciiCharSequence implements CharSequence {

        private final byte array[];
        //private final char value;

        public AsciiCharSequence(byte array[]) {
            this.array = Arrays.copyOf(array, array.length);
        }

        @Override
        public int length() {
            return array.length;
        }

        @Override
        public char charAt(int index) {
            if ((index < 0) || (index >= array.length)) {
                throw new StringIndexOutOfBoundsException(index);
            }
            return (char) array[index];

        }

        @Override
        public CharSequence subSequence(int start, int end) {
            if (start < 0) {
                throw new StringIndexOutOfBoundsException(start);
            }
            if (end > array.length) {
                throw new StringIndexOutOfBoundsException(end);
            }
            int subLen = end - start;
            if (subLen < 0) {
                throw new StringIndexOutOfBoundsException(subLen);
            }

            byte[] buf = new byte[subLen];
            for (int i = 0; i < buf.length; i++) {
                buf[i] = array[i + start];
            }
            AsciiCharSequence result = new AsciiCharSequence(buf);

            return ((start == 0) && (end == array.length)) ? this
                    : result;
        }

        @Override
        public String toString() {
            return new String(array);
        }
    }
}
