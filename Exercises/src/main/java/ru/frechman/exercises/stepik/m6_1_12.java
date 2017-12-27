package ru.frechman.exercises.stepik;

public class m6_1_12 {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
    }

    static class Pair<T, V> {

        private final T value;
        private final V value2;

        private Pair(T value, V value2) {
            this.value = value;
            this.value2 = value2;
        }

        public static <T, V> Pair<T, V> of(T value, V value2) {
            return new Pair<>(value, value2);
        }

        public T getFirst() {
            return value;
        }

        public V getSecond() {
            return value2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair<?, ?> pair = (Pair<?, ?>) o;

            if (value != null ? !value.equals(pair.value) : pair.value != null) return false;
            return value2 != null ? value2.equals(pair.value2) : pair.value2 == null;
        }

        @Override
        public int hashCode() {
            int result = value != null ? value.hashCode() : 0;
            result = 31 * result + (value2 != null ? value2.hashCode() : 0);
            return result;
        }
    }
}
