package com.garage.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponsedto {
    private int userid;
    private String firstname;
    private String lastname;
    private String email;
    private String phonenumber;
    private String password;
    private String address;
}
