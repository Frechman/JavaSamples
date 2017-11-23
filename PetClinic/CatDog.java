package petClinic;

public class CatDog extends Animal implements Pet{

    private final Cat cat;
    private final Dog dog;

    public CatDog(Cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }

    @Override
    public void makeSound() {
        this.cat.makeSound();
        this.dog.makeSound();
    }

    @Override
    public void sleep(int minutes) {
        this.cat.sleep(minutes);
        this.dog.sleep(minutes);
    }

    @Override
    public void eat() {
        this.cat.eat();
        this.dog.eat();
    }

    @Override
    public String getName() {
        return String.format("%s%s", this.cat.getName(), this.dog.getName());
    }

    @Override
    public void setName(String name) {
        this.cat.setName(name);
        this.dog.setName(name);
    }


}
