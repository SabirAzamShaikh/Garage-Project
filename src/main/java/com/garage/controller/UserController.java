package com.garage.controller;

import com.garage.dto.UserRequestdto;
import com.garage.dto.UserResponsedto;
import com.garage.entity.ApiResponse;
import com.garage.entity.Users;
import com.garage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService service;
@GetMapping("/fetchalluser")
public ApiResponse<List<UserResponsedto>> getAll()
{


return null;
}
@PostMapping("/createuser")
public ApiResponse<UserResponsedto> makeuser(@RequestBody UserRequestdto dto){
    return service.createuser(dto);
}
}
