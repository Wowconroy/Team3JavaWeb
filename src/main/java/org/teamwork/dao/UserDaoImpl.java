package org.teamwork.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.teamwork.model.User;

import java.util.List;

@Transactional
@Repository
public class UserDaoImpl implements UserDao<User> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User getById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, id);
//        return sessionFactory.getCurrentSession().find(User.class, id);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from User").getResultList();
    }

    @Override
    public void create(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(user);
    }

    @Override
    public void update(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(user);
    }

    @Override
    public void delete(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(user);
    }
}
