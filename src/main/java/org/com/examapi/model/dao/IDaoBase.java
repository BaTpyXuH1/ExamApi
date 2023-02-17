package org.com.examapi.model.dao;

import java.util.List;
import java.util.Optional;


public interface IDaoBase<E> {
    List<E> findAll();
    E getById(Integer id);
    E add(E item);
    E update(E item);
    E delete(Integer id);
}
