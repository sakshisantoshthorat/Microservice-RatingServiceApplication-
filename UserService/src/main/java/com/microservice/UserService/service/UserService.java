package com.microservice.UserService.service;

import com.microservice.UserService.entity.User;
import com.microservice.UserService.exception.ResourceNotFoundException;
import com.microservice.UserService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService implements userServiceInterface{

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user){
        if (user.getId() == null || user.getId().isEmpty()) {
            user.setId(UUID.randomUUID().toString());
        }
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(String id){
        return userRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("User not found with " + id));
    }

}
