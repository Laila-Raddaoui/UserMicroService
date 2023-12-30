package com.microserviceuser.services.implementations;

import com.microserviceuser.controllers.implementations.UserController;
import com.microserviceuser.models.implementations.User;
import com.microserviceuser.repositories.implementations.UserRepository;
import com.microserviceuser.services.GenericService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
public class UserService extends GenericService<User> {
    public UserService(UserRepository userRepository){
        super(userRepository);
    }
}
