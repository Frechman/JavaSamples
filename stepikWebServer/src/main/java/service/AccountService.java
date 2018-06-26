package service;

import model.User;
import repository.UsersRepository;

public class AccountService {

    private final UsersRepository usersRepository;

    public AccountService() {
        this.usersRepository = new UsersRepository();
    }

    public void addUser(User user) {

    }

    public User getUserByLogin(String login) {
        return null;
    }
}
