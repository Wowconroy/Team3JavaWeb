package org.teamwork.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.teamwork.dao.DAO;

import javax.persistence.EntityNotFoundException;
import java.util.List;

public class DAOImpl<T> implements DAO<T> {
    public LocalSessionFactoryBean localSessionFactoryBean;

    protected SessionFactory sessionFactory;


    @Autowired
    public DAOImpl(LocalSessionFactoryBean localSessionFactoryBean) {
        this.localSessionFactoryBean = localSessionFactoryBean;
        sessionFactory = localSessionFactoryBean.getObject();
    }

    @Override
    public void save(T entity) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.save(entity);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("Error performing JPA operation. Transaction is rolled back");
        } finally {
            session.close();
        }
    }

    @Override
    public void update(T entity) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.update(entity);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("Error performing JPA operation. Transaction is rolled back");
        } finally {
            session.close();
        }
    }

    @Override
    public List<T> findAll(Class clazz) {
        List<T> objects = null;
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            Query query = session.createQuery("from " + clazz.getName());
            objects = query.list();
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("Error performing JPA operation. Transaction is rolled back");
        } finally {
            session.close();
        }
        return objects;
    }


    public Object findById(int id, Class clazz) {
        Session session = sessionFactory.openSession();
        Object entity = session.find(clazz, id);
        if (entity == null) {
            throw new EntityNotFoundException("Can't find entity for ID "
                    + id);
        }
        session.close();
        return entity;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(int i, Class clazz) {
        T t = (T) findById(i, clazz);
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.remove(t);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("Error performing JPA operation. Transaction is rolled back");
        } finally {
            session.close();
        }
    }
}
