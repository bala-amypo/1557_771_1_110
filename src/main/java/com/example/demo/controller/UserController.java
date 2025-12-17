package com.example.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.entity.User;
import com.example.demo1.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/register")
    public User registerUser(@Valid @RequestBody User user){
          return userService.registerUser(user);
    }
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();    
    }
    @GetMapping("/{id}")
    public User gettUser(@PathVariable long id){
        return userService.getUser(id);
    }
}
