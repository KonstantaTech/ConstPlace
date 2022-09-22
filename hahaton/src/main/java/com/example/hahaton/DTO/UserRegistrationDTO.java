package com.example.hahaton.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRegistrationDTO {

    private String name;
    private String surname;
    private String email;
    private String contactNumber;
    private String password;
}
