package com.jcmc.demo.mongo.user.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @NotNull
    private int id;

    @NotNull
    private String firstName;

    private String lastName;

    @NotNull
    private String email;

    @Size(min = 10)
    private String password;

}
