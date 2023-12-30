package com.microserviceuser.models.implementations;

import com.microserviceuser.models.GenericModel;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "login")
@AllArgsConstructor
@NoArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@ToString(callSuper = true)
public class Login extends GenericModel {

    private  String email;
    private  String password;
    private  String  role;
}
