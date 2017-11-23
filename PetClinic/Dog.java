package petClinic;

public class Dog extends Animal implements Pet{

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    /**
     * Собака лает
     */
    @Override
    public void makeSound() {
        System.out.println("Wowww! ");
    }

    /**
     * Есть свой корм .. реализация еды
     */
    @Override
    public void eat() {
        System.out.println("I'm eat  + food");
    }

    /**
     * Спит
     * @param minutes кол-во минут на сколько заснет питомец
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
        return name;
    }

    /**
     * Изменить имя питомца
     * @param name новая кличка питомца
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }
}
