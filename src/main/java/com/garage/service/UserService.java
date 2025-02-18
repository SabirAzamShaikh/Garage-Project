package com.garage.service;

import com.garage.dto.UserRequestdto;
import com.garage.dto.UserResponsedto;
import com.garage.entity.ApiResponse;

import java.util.List;

public interface UserService {
public ApiResponse<List<UserResponsedto>> fetchAll();
public ApiResponse<UserResponsedto> createuser(UserRequestdto reqdto);

}
