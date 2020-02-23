package com.mackenzie.cif.person.domain.domain;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Embeddable
public class Person {

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String email;

    @NotNull
    @Size(min = 6, max = 8)
    private String password;

    private String sex;

    private String telephoneNumber;
}
