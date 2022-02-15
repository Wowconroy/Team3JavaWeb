package org.teamwork.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.teamwork.model.Author;

import java.util.List;

@Repository
public class AuthorDAOImpl implements AuthorDAO {

    private SessionFactory sessionFactory;

    @Autowired

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Author> getAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Author").list();
    }

    @Override
    public void create(Author author) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(author);

    }

    @Override
    public void update(Author author) {
        Session session = sessionFactory.getCurrentSession();
        session.update(author);

    }

    @Override
    public void delete(Author author) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(author);

    }

    @Override
    public Author getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Author.class, id);
    }
}