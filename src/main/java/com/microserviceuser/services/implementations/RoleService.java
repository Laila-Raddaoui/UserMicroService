package com.microserviceuser.services.implementations;

import com.microserviceuser.models.implementations.Role;
import com.microserviceuser.repositories.implementations.RoleRepository;
import com.microserviceuser.services.GenericService;
import org.springframework.stereotype.Service;

@Service
public class RoleService extends GenericService<Role> {
    public RoleService(RoleRepository roleRepository){
        super(roleRepository);
    }
}
