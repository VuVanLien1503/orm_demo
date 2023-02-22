package com.example.orm_demo.service.service_interface;

import java.util.List;

public interface ISearch<E>{
    E findById(Long id);
    public List<E> findByName(String value);
}
