package ru.frenchman.repository;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import ru.frenchman.model.User;

public class UsersRepository {

    private final Session session;

    public UsersRepository(Session session) {
        this.session = session;
    }

    public long createUser(String login, String password) {
        User user = new User(login, password);
        return (Long) session.save(user);
    }

    public User update(User user) {
        session.saveOrUpdate(user);
        return user;
    }

    public User findById(long id) {
        return (User) session.get(User.class, id);
    }

    public User findByLogin(String login) {
        Criteria criteria = session.createCriteria(User.class);
        return ((User) criteria.add(Restrictions.eq("login", login)).uniqueResult());
/*
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<User> criteriaQuery = builder.createQuery(User.class);
        Root<User> root = criteriaQuery.from(User.class);
        criteriaQuery.select(root);
        criteriaQuery.where(builder.equal(root.get("login"), login));
        Query<User> q = session.createQuery(criteriaQuery);
        User result = q.getSingleResult();
        return result;*/
    }


    public boolean deleteUser(long id) {
        boolean result = false;
        User foundUser = findById(id);
        if (foundUser != null) {
            session.delete(id);
            result = true;
        }
        return result;
    }
}
