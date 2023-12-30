package com.microserviceuser.services.implementations;

import com.microserviceuser.models.implementations.Login;
import com.microserviceuser.repositories.implementations.LoginRepository;
import com.microserviceuser.services.GenericService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class LoginService extends GenericService<Login> {
    public LoginService(LoginRepository loginRepository){
        super(loginRepository);

    }
}
