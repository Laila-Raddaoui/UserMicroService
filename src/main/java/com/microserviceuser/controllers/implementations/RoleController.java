package com.microserviceuser.controllers.implementations;

import com.microserviceuser.controllers.GenericController;
import com.microserviceuser.models.implementations.Role;
import com.microserviceuser.services.implementations.RoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/roles")
public class RoleController extends GenericController<Role> {
    public RoleController(RoleService roleService){
        super(roleService);
    }
}
