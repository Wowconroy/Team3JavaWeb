package org.teamwork.services;

import org.hibernate.Session;
import org.teamwork.model.User;

import java.util.List;

public interface UserService {
    User getById(Long id);

    List<User> getAll();

    void create(User user);

    void update(User user);

    void delete(User user);
}
