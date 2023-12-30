package com.microserviceuser.models.implementations;

import com.microserviceuser.interfaces.IGeneric;
import com.microserviceuser.models.GenericModel;
import com.mongodb.annotations.Sealed;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(value = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@ToString(callSuper = true)
public class User extends GenericModel  {

    private String lastName;
    private String firstName;
    private String login;

    private String password;
    private List<Role> roles;

}
