package com.example.demo1.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo1.entity.Resource;
import com.example.demo1.repository.ResourceRepository;
import com.example.demo1.service.ResourceService;
@Service
public class ResourceServiceImpl implements ResourceService{
    
    private ResourceRepository resourceRepository;
    ResourceServiceImpl(ResourceRepository resourceRepository){
        this.resourceRepository=resourceRepository;
    }
    @Override
    public Resource createResource(Resource resource){
        return resourceRepository.save(resource);
    }
    @Override
    public Resource getResource(long id){
        Optional<Resource> optionaldata = resourceRepository.findById(id);
        return optionaldata.orElse(null);
    }
    @Override
    public  List<Resource> getAllResource(){
           return resourceRepository.findAll();
    }

}
