package org.teamwork.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.teamwork.model.User;

import java.util.List;
import java.util.Optional;

@Repository
public class UserDao implements Dao<User>{

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Optional<User> getById(int id) {
        return Optional.empty();
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void create(User user) {

    }

    @Override
    public void update(User user, String[] params) {

    }

    @Override
    public void delete(User user) {

    }

    public void testQuery(){
        //solve this
        String hql = "SELECT COUNT (*) FROM user_db";
        Query query = getSessionFactory().openSession().createQuery(hql);
        query.uniqueResult();
    }
}
