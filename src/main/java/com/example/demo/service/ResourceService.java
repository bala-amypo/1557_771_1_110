package com.example.demo1.service;

import java.util.List;

import com.example.demo1.entity.Resource;

public interface ResourceService {
    Resource createResource(Resource resource);
    Resource getResource(long id);
    List<Resource> getAllResource();
}
