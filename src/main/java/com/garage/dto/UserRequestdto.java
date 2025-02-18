package com.garage.dto;

import lombok.Data;

@Data
public class UserRequestdto {
    private String firstname;
    private String lastname;
    private String email;
    private String phonenumber;
    private String password;
    private String address;
}
