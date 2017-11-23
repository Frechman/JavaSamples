package petClinic;

public class Client {

    private String name;
    private Pet pet;


    public Client(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    /**
     * Получить имя клиента
     * @return возвращает имя клиента
     */
    public String getName() {
        return name;
    }

    /**
     * Вернуть питомца
     * @return возвращает питомца
     */
    public Pet getPet() {
        return pet;
    }

    @Override
    public String toString() {
        return "Client \"" + name + "\" has a pet: " + pet.getName();
    }
}
