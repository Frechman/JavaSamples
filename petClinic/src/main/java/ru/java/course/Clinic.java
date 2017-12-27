package ru.java.course;

/**
 * Класс реализующий работы клиники домашних клиентов.
 */
public class Clinic {

    /**
     * Список клиентов. База клиентов.
     */
    private final Client[] clients;

    /**
     * Создание клиники на заданное колличество клиентов.
     *
     * @param size колличество клиентов.
     */
    public Clinic(final int size) {
        this.clients = new Client[size];
    }

    /**
     * Какой питомец есть у клиента.
     *
     * @param clientName имя клиента.
     * @return возвращает название "типа" питомца.
     */
    public String getPetByClient(String clientName) {
        if (clientName == null) {
            return "Такого клиента не существует";
        }
        /*
        for (Client client : clients) {
            if (client.getName().equalsIgnoreCase(clientName))
                return client.getPet().getClass().getSimpleName();
        }*/

        for (int i = 0; i < clients.length; i++) {
            if (clients[i].getName().equalsIgnoreCase(clientName)) {
                return clients[i].getPet().getClass().getSimpleName();
            }
        }
        return "Такого клиента не существует";
    }

    /**
     * Добавить клиента.
     *
     * @param position позиция в клинике.
     * @param client   У клиента должно быть имя и питомец.
     */
    public void addClient(final int position, final Client client) {
        if (client == null) {
            return;
        }
        clients[position] = client;
    }

    /**
     * Поиск по кличке питомца.
     *
     * @param petName кличка питомца.
     * @return возвращает клиента или null, если питомец не найден.
     */
    public Client findClientsByPetName(final String petName) {
        if (petName == null) {
            return new Client(null, null);
        }
        for (Client client : clients) {
            if (petName.equalsIgnoreCase(client.getPet().getName())) {
                return client;
            }
        }
        return null;
    }

    /**
     * Поиск по имени клиента.
     *
     * @param clientName имя клиента.
     * @return возвращает питомца или null, если питомец не найден.
     */
    public Pet findPetByClientName(final String clientName) {
        for (Client client : clients) {
            if (clientName.equalsIgnoreCase(client.getName())) {
                return client.getPet();
            }
        }
        return null;
    }

    /**
     * Редактировать имя клиента.
     *
     * @param oldNameClient старое имя клиента, которое надо изменить.
     * @param newNameClient новое имя клиента.
     */
    public void editNameClient(String oldNameClient, String newNameClient) {
        for (Client client : clients) {
            if (oldNameClient.equalsIgnoreCase(client.getName())) {
                client = new Client(newNameClient, client.getPet());
            }
        }
    }

    /**
     * Редактировать кличку питомца.
     *
     * @param oldNamePet старая кличка, которую нужно изменить.
     * @param newNamePet новая кличка.
     */
    public void editNamePet(String oldNamePet, String newNamePet) {
        for (Client client : clients) {
            if (oldNamePet.equalsIgnoreCase(client.getPet().getName())) {
                client.getPet().setName(newNamePet);
            }
        }
    }

    /**
     * Удаление клиента.
     *
     * @param nameClientOrNamePet имя либо клиента, либо питомца.
     */
    public void deleteClient(String nameClientOrNamePet) {
        for (Client client : clients) {
            if (nameClientOrNamePet.equalsIgnoreCase(client.getName()) || nameClientOrNamePet.equalsIgnoreCase(client.getPet().getName())) {
                client = null;
            }
        }
    }

    /**
     * Метод проверяет существует ли уже клиент с таким именем.
     *
     * @param clientName имя клиента.
     * @return если клиент уже существует возвращает true, иначе false.
     */
    public boolean isExistClient(String clientName) {
        boolean isExist = false;
        if (clientName == null) {
            return false;
        }
        /*
        for (Client client : clients) {
            if (Objects.equals(clientName, client.getName())){
                isExist = true;
            }
        }*/
        for (int i = 0; i < this.clients.length; i++) {
            if (clientName.equalsIgnoreCase(this.clients[i].getName())) {
                isExist = true;
            }
        }
        return isExist;
    }

    /**
     * Метод проверяет существует ли уже питомец с такой кличкой.
     *
     * @param petName кличка питомца.
     * @return если питомец уже существует возвращает true, иначе false.
     */
    public boolean isExistPet(String petName) {
        boolean isExist = false;
        if (petName == null) {
            return false;
        }
        for (Client client : clients) {
            if (petName.equalsIgnoreCase(client.getPet().getName())) {
                isExist = true;
            }
        }
        return isExist;
    }

}
