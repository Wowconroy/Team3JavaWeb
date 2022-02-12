package org.teamwork.dao;

import java.util.List;

public interface UserDao<T>{
    T getById(Long id);

    @SuppressWarnings("unchecked")
    List<T> getAll();

    void create(T t);

    void update(T t);

    void delete(T t);
}
