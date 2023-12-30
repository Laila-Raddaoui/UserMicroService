package com.microserviceuser.services;

import com.microserviceuser.interfaces.IGeneric;
import com.microserviceuser.metier.IMetier;
import com.microserviceuser.repositories.GenericRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;


@AllArgsConstructor
public class GenericService <T extends IGeneric> implements IMetier<T> {
     public GenericRepository<T> genericRepository;

    @Override
    public T save(T entity) {
        return (!Objects.isNull(entity)) ? genericRepository.save(entity): null;
    }

    @Override
    public List<T> findAll() {
        return genericRepository.findAll();
    }

    @Override
    public T deleteById(String id) {
        return null;
    }

    @Override
    public T findById(String id) {
        return genericRepository.findById(id).orElse(null);
    }

    @Override
    public T update(T entity) {
        return null;
    }
}
