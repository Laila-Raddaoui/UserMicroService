package com.microserviceuser.metier;

import com.microserviceuser.interfaces.IGeneric;

import java.util.List;

public interface IMetier<T extends IGeneric> {

    T save(T entity);

    List<T> findAll();

    T deleteById(String id);

    T findById(String id);

    T update(T entity);
}
