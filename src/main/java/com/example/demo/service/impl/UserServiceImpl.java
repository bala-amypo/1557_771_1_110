package com.example.demo.service.impl;

import java.util.List;


import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository  = userRepository;
    }
    @Override
    public User registerUser(User user){
        if(userRepository.existsByEmail(user.getEmail())){
            throw new IllegalArgumentException("User mail exists");
        }
         return userRepository.save(user);
    }
    @Override
   public User getUser(long id){
    return userRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
}

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
