package com.example.demo1.service;

import java.util.List;

import com.example.demo1.entity.User;

public interface UserService {
    User registerUser(User user);
    User getUser(long id);
    List<User> getAllUsers();
}
