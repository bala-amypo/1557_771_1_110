package com.example.demo1.service;

import java.util.List;

import com.example.demo1.entity.AllocationRule;

public interface AllocationRuleService {
    AllocationRule createRule(AllocationRule rule);
    AllocationRule getRule(long id);
    List<AllocationRule> getAllRules();
}
