package com.example.demo.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Resource;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.ResourceRepository;
import com.example.demo.service.ResourceService;
@Service
public class ResourceServiceImpl implements ResourceService{
    
    private ResourceRepository resourceRepository;
    ResourceServiceImpl(ResourceRepository resourceRepository){
        this.resourceRepository=resourceRepository;
    }
    @Override
    public Resource createResource(Resource resource){
        if(resourceRepository.existsByResourceName(resource.getResourceName())){
            throw new IllegalArgumentException("Name exists");
        }
        return resourceRepository.save(resource);

    }
    @Override
    public Resource getResource(long id){
        return resourceRepository.findById(id)
        .orElseThrow(()->new ResourceNotFoundException("Id doesn't exists"));
    }
    @Override
    public  List<Resource> getAllResource(){
           return resourceRepository.findAll();
    }

}
