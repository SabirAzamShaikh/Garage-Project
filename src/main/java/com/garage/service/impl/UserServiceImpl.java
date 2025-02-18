package com.garage.service.impl;

import com.garage.dto.UserRequestdto;
import com.garage.dto.UserResponsedto;
import com.garage.entity.ApiResponse;
import com.garage.entity.Users;
import com.garage.mapper.UserMapper;
import com.garage.repository.UserRepository;
import com.garage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userrepo;
    @Autowired
    private UserMapper mapper;
    @Override
    public ApiResponse<List<UserResponsedto>> fetchAll() {
        return null;
    }

    @Override
    public ApiResponse<UserResponsedto> createuser(UserRequestdto reqdto) {
        Users saveduser= userrepo.save(mapper.DtoToEntity(reqdto));

        return new ApiResponse<UserResponsedto>("CREATED","User created succesfully",mapper.EntityToDto(saveduser));
    }
}
