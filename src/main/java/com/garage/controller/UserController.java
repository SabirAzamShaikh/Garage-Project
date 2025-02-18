package com.garage.controller;

import com.garage.Entity.ApiResponse;
import com.garage.Entity.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController
{
@GetMapping("/fetchalluser")
public ApiResponse<List<Users>> getAll()
{


return null;
}
}
