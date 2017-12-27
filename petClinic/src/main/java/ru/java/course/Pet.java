package ru.java.course;

interface Pet {

    /**
     * Кличка питомца.
     *
     * @return возвращает кличку питомца.
     */
    String getName();

    /**
     * Дать кличку домашнему питомцу.
     *
     * @param name кличка питомца.
     */
    void setName(final String name);

}