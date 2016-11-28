package ru.sbrf.model.repositories;

/**
 * Created by Wais on 28.11.2016.
 */
public interface Specification<T> {
    boolean specified(T value);
}
