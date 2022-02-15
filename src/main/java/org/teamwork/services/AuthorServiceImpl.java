package org.teamwork.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.teamwork.dao.AuthorDAO;
import org.teamwork.model.Author;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorDAO authorDAO;

    @Autowired
    public void setAuthorDAO(AuthorDAO authorDAO) {
        this.authorDAO = authorDAO;
    }

    @Override
    @Transactional
    public List<Author> getAll() {
        return authorDAO.getAll();
    }

    @Override
    @Transactional
    public void create(Author author) {
        authorDAO.create(author);
    }

    @Override
    @Transactional
    public void update(Author author) {
        authorDAO.update(author);
    }

    @Override
    @Transactional
    public void delete(Author author) {
        authorDAO.delete(author);
    }

    @Override
    @Transactional
    public Author getById(int id) {
        return authorDAO.getById(id);
    }
}
