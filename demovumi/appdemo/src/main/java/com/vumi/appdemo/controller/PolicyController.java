package com.vumi.appdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vumi.appdemo.services.PolicyService;
import com.vumi.entity.Policy;

@RestController
@RequestMapping(value = "/api/v1")
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    @GetMapping(value = "/policies")
    public ResponseEntity<?> getPolicies ( @RequestParam( name = "issue", required = false ) String issue ) throws Exception {
        
        List<Policy> policies = policyService.findAll(issue);
        return ResponseEntity.ok( policies );

    } 
}
