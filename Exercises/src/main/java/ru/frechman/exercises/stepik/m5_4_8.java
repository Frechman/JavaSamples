package ru.frechman.exercises.stepik;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

//https://stepik.org/lesson/12785/step/8
public class m5_4_8 {
    class Animal implements Serializable {
        private final String name;

        public Animal(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Animal) {
                return Objects.equals(name, ((Animal) obj).name);
            }
            return false;
        }
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {

        Animal[] resultDeserialize;
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
            resultDeserialize = new Animal[ois.readInt()];
            for (int i = 0; i < resultDeserialize.length; i++) {
                resultDeserialize[i] = (Animal) ois.readObject();
            }
            return resultDeserialize;
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }
}
