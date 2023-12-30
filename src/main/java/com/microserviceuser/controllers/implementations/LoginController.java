package com.microserviceuser.controllers.implementations;

import com.microserviceuser.controllers.GenericController;
import com.microserviceuser.models.implementations.Login;
import com.microserviceuser.services.implementations.LoginService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/login")
public class LoginController extends GenericController<Login> {
    public LoginController(LoginService loginService){
        super(loginService);
    }
}
