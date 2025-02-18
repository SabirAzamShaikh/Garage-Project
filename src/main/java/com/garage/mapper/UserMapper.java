package com.garage.mapper;

import com.garage.dto.UserRequestdto;
import com.garage.dto.UserResponsedto;
import com.garage.entity.Users;
import org.springframework.stereotype.Component;

@Component
public class UserMapper
{
public Users DtoToEntity(UserRequestdto reqdto)
{
    Users user=new Users();
    user.setFirstname(reqdto.getFirstname());
    user.setPassword(reqdto.getPassword());
    user.setEmail(reqdto.getEmail());
    user.setPhonenumber(reqdto.getPhonenumber());
    user.setAddress(reqdto.getAddress());
    user.setLastname(reqdto.getLastname());
    return user;
}
public UserResponsedto EntityToDto(Users users)
{
    UserResponsedto dto=new UserResponsedto(users.getUserid(), users.getFirstname(),users.getLastname(),users.getEmail(),users.getPhonenumber(),users.getPassword(),users.getAddress());
    return dto;
}
}
