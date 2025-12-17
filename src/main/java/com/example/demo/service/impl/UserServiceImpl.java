package com.example.demo1.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo1.entity.User;
import com.example.demo1.repository.UserRepository;
import com.example.demo1.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository  = userRepository;
    }
    @Override
    public User registerUser(User user){
         return userRepository.save(user);
    }
    @Override
    public User getUser(long id){
        Optional<User>optionalUser = userRepository.findById(id);
        return optionalUser.orElse(null);
    }
    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
