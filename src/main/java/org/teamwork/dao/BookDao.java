package org.teamwork.dao;

import org.teamwork.model.Book;

import java.util.List;
import java.util.Optional;

public class BookDao implements Dao<Book>{

    @Override
    public Optional<Book> getById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Book> getAll() {
        return null;
    }

    @Override
    public void create(Book book) {

    }

    @Override
    public void update(Book book, String[] params) {

    }

    @Override
    public void delete(Book book) {

    }
}
