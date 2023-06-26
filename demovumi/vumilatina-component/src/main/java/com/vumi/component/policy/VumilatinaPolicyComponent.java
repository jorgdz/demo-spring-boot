package com.vumi.component.policy;

import java.util.ArrayList;
import java.util.List;

import com.vumi.entity.Policy;
import com.vumi.interfaces.PolicyComponent;

public class VumilatinaPolicyComponent implements PolicyComponent {

    @Override
    public List<Policy> findAll(String issue) {
        
        List<Policy> policies = new ArrayList<>();

        Policy p1 = new Policy();
        p1.setId(1L);
        p1.setIssueName(issue);
        p1.setPrice(200);
        p1.setEffectiveDate("2022-02-05");

        Policy p2 = new Policy();
        p2.setId(2L);
        p2.setIssueName(issue);
        p2.setPrice(150);
        p2.setEffectiveDate("2023-01-01");
        
        policies.add(p1);
        policies.add(p1);

        return policies;
        
    }
    
}
