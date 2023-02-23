package com.example.orm_demo.service.service_interface;

import java.util.List;

public interface ICrudRepository<E> {
    List<E> findAll();
    void save (E e);
    void update(int index,E e);
    void delete(E e);
}
