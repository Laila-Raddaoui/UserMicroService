package com.microserviceuser.controllers.implementations;

import com.microserviceuser.controllers.GenericController;
import com.microserviceuser.models.implementations.User;
import com.microserviceuser.services.implementations.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
public class UserController extends GenericController<User> {
    public UserController(UserService userService){
        super(userService);
    }
}
