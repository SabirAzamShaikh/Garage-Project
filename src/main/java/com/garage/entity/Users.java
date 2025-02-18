package com.garage.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users
{
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    private int userid;
private String firstname;
private String lastname;
private String email;
private String phonenumber;
private String password;
private String address;
}
