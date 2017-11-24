package ru.javaCourse;

public class Dog extends Animal implements Pet {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    /**
     * Собака лает.
     */
    @Override
    public void makeSound() {
        System.out.println("Wowww! ");
    }

    /**
     * Ест свой корм .. реализация еды.
     */
    @Override
    public void eat() {
        System.out.println("I'm eat  + food");
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
        return name;
    }

    /**
     * Дать кличку домашнему питомцу.
     *
     * @param name кличка питомца.
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }
}
