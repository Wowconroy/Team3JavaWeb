package org.teamwork.dao;

import org.teamwork.model.Author;

import java.util.List;

public interface AuthorDAO {

    List<Author> getAll();

    void create(Author author);

    void update(Author author);

    void delete(Author author);

    Author getById(int id);
}