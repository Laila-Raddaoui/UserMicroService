package com.microserviceuser.models;

import com.microserviceuser.interfaces.IGeneric;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@ToString(callSuper = true)
public class GenericModel implements Serializable, IGeneric {

    private String id;

}
