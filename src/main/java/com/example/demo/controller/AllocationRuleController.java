package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AllocationRule;
import com.example.demo.service.AllocationRuleService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/rules")
public class AllocationRuleController {
    @Autowired
    AllocationRuleService allocationRuleService;

    @PostMapping
    public AllocationRule createAllocationRule(@Valid @RequestBody AllocationRule allocationRule){
        return allocationRuleService.createRule(allocationRule);
    }
    @GetMapping
    public List<AllocationRule> getAllRules(){
        return allocationRuleService.getAllRules();
    }
    @GetMapping("/{id}")
    public AllocationRule getRule(@PathVariable long id){
        return allocationRuleService.getRule(id);
    }
}
