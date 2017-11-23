package petClinic;

public class Cat extends Animal implements Pet{

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
     * Есть свой корм .. реализация еды
     */
    @Override
    public void eat() {
        System.out.println("I'm eat!");
    }

    /**
     * Спать.
     * @param minutes кол-во минут на сколько заснет питомец.
     */
    @Override
    public void sleep(int minutes) {
        super.sleep(minutes);
    }

    /**
     * Имя питомца
     * @return возвращает имя питомца
     */
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(final String name) {
        this.name = name;
    }
}
