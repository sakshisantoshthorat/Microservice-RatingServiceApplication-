package com.microservice.UserService.service;

import com.microservice.UserService.entity.User;

import java.util.List;

public interface userServiceInterface {
    User saveUser(User user);

    List<User> getAllUsers();

    User getUserById(String id);
}
