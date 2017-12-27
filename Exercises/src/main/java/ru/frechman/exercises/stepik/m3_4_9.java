package ru.frechman.exercises.stepik;

public class m3_4_9 {
    public static void main(String[] args) {

    }

    public final class ComplexNumber {
        private final double re;
        private final double im;

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }


        @Override
        public boolean equals(Object obj) {
            if (this == obj) {   //сравниваем ведут ли ссылки на один и тот же объект
                return true;
            }
            if (obj == null) {   //сравниваем с null - всегда false
                return false;
            }
            if (obj instanceof ComplexNumber) {  //если объект принадлежит данному классу
                ComplexNumber other = (ComplexNumber) obj;  //приводим объект к нашему классу
                //сравниваем содержимое(поля) объекта
                if ((this.getRe() == other.getRe()) & (this.getIm() == other.getIm())) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            Double result = 1.0;
            result = prime * result + getRe();
            result = prime * result + getIm();
            return Double.hashCode(result);
        }
    }
}
