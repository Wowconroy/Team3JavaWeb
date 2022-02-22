package org.teamwork.dao;

import org.teamwork.model.Author;

import java.util.List;

public interface AuthorDAO extends DAO<Author> {
    Author findByFullName(String[] fullName);
}
