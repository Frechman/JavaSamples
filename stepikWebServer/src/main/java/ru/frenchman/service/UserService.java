package ru.frenchman.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ru.frenchman.SessionFactoryUtil;
import ru.frenchman.model.User;
import ru.frenchman.repository.UsersRepository;

public class UserService {

    private final SessionFactory sessionFactory;

    public UserService() {
        this.sessionFactory = new SessionFactoryUtil().getSessionFactory();
    }

    public long addUser(String login, String password) {
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        UsersRepository usersRepository = new UsersRepository(session);
        long id = usersRepository.createUser(login, password);
        tr.commit();
        session.close();
        return id;
    }

    public User getUserByLogin(String login) {
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        UsersRepository usersRepository = new UsersRepository(session);
        User user = usersRepository.findByLogin(login);
        tr.commit();
        session.close();
        return user;
    }

    public User getUserById(long id) {
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        UsersRepository usersRepository = new UsersRepository(session);
        User user = usersRepository.findById(id);
        tr.commit();
        session.close();
        return user;
    }

    public User updateUser(User user) {
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        UsersRepository usersRepository = new UsersRepository(session);
        User updatedUser = usersRepository.update(user);
        tr.commit();
        session.close();
        return updatedUser;
    }

}
