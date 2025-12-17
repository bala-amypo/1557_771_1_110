package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Resource;
import com.example.demo.service.ResourceService;

@RestController
@RequestMapping("/auth")
public class AuthController {
    
    @Autowired
    ResourceService resourceService;

    @PostMapping("/register")
    public Resource createRegister(@RequestBody Resource resource){
        return resourceService.createResource(resource);
    }
    @GetMapping
    public List<Resource> getall(){
        return resourceService.getAllResource();
    }

}
