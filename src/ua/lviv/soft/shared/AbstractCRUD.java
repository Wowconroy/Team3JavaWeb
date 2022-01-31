package ua.lviv.soft.shared;

import java.util.List;

public interface AbstractCRUD<T> {
    T create(T t);

    T read(Integer t);

    T update(T t);

    void delete(Integer t);

    List<T> readAll();
}
