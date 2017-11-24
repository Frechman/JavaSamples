package ru.javaCourse;

public class CatDog extends Animal implements Pet {

    private final Cat cat;
    private final Dog dog;

    public CatDog(Cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }

    /**
     * КотоПёс и мяукает и лает.
     */
    @Override
    public void makeSound() {
        this.cat.makeSound();
        this.dog.makeSound();
    }

    /**
     * Спать.
     *
     * @param minutes кол-во минут на сколько заснет питомец.
     */
    @Override
    public void sleep(int minutes) {
        this.cat.sleep(minutes);
        this.dog.sleep(minutes);
    }

    /**
     * КотоПёс есть сначала за кошку, а потом ещё за пса.
     */
    @Override
    public void eat() {
        this.cat.eat();
        this.dog.eat();
    }

    /**
     * Кличка питомца.
     *
     * @return возвращает кличку питомца.
     */
    @Override
    public String getName() {
        return String.format("%s%s", this.cat.getName(), this.dog.getName());
    }

    /**
     * Дать кличку домашнему питомцу.
     *
     * @param name кличка питомца.
     */
    @Override
    public void setName(String name) {
        this.cat.setName(name);
        this.dog.setName(name);
    }

}
