package ru.java.course;

public abstract class Animal {

    /**
     * Издать звук.
     */
    public abstract void makeSound();

    /**
     * Поесть  .. добавить реализацию выбор корма.
     */
    public void eat() {
        System.out.println("I'm eat...");
    }

    /**
     * Спать.
     *
     * @param minutes кол-во минут на сколько заснет питомец.
     */
    public void sleep(int minutes) {
        System.out.println("I'm sleep " + minutes + " minutes.");
    }

    /* реализовать метод определения голоден ли питомец
    public boolean isHungry(int eatAnMinutsAgo){
        return eatAnMinutsAgo >= 60 ? true : false;
    }
    */
}
