package ru.sbrf.model.repositories;

import java.util.List;

/**
 * Created by Wais on 28.11.2016.
 */
public interface Repository<T> {
    void add(T value);

    void update(T value);

    void remove(T value);

    List<T> query(Specification<T> specification);
}
