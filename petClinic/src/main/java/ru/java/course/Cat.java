package ru.java.course;

public class Cat extends Animal implements Pet {

    private String name;

    public Cat(final String name) {
        this.name = name;
    }

    /**
     * Мяукает!
     */
    @Override
    public void makeSound() {
        System.out.println("Mau! ");
    }

    /**
     * Есть свой корм .. реализация еды, разновидность корма.
     */
    @Override
    public void eat() {
        System.out.println("I'm eat!");
    }

    /**
     * Спать.
     *
     * @param minutes кол-во минут на сколько заснет питомец.
     */
    @Override
    public void sleep(int minutes) {
        super.sleep(minutes);
    }

    /**
     * Кличка питомца.
     *
     * @return возвращает кличку питомца.
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Дать кличку домашнему питомцу.
     *
     * @param name кличка питомца.
     */
    @Override
    public void setName(final String name) {
        this.name = name;
    }

}
