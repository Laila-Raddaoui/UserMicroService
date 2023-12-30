package com.microserviceuser.models.implementations;

import com.microserviceuser.models.GenericModel;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(value = "roles")
@AllArgsConstructor
@NoArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@ToString(callSuper = true)
public class Role extends GenericModel {
    private List<User>users;

}
