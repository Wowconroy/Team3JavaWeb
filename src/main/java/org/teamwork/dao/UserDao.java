package org.teamwork.dao;

import org.teamwork.model.User;

import java.util.List;
import java.util.Optional;

public class UserDao implements Dao<User>{
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
}
