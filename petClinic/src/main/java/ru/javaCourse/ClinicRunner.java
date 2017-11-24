package ru.javaCourse;

/**
 * Класс запускает работу клиники.
 */
public class ClinicRunner {

    public static void main(String[] args) {
        final Clinic clinic = new Clinic(10);

        clinic.addClient(0, new Client("Sasha", new Cat("Pushok")));

        clinic.addClient(1, new Client("Irina", new Cat("Kusya")));

        clinic.addClient(2, new Client("Ivan", new Dog("Persik")));

        clinic.addClient(3, new Client("Vasya", new Dog("Pes")));

        clinic.addClient(4, new Client("Sergey", new CatDog(new Cat("PushokCat"), new Dog("DogPes"))));

        Client client = new Client("Masha", new Dog("pe1t"));
        Client client1 = new Client("alesha", new Cat("cat1123"));
        System.out.println(client.getPet().getClass().getSimpleName());
        System.out.println(client.getName());
        System.out.println(client.getPet().getName());
        System.out.println(client1.toString());
        System.out.println(client.toString());
    }

}
