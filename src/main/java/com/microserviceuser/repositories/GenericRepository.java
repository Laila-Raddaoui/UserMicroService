package com.microserviceuser.repositories;

import com.microserviceuser.interfaces.IGeneric;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericRepository  <T extends IGeneric> extends MongoRepository<T,String> {
}
