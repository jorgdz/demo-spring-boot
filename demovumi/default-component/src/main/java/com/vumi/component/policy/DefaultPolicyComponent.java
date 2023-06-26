package com.vumi.component.policy;

import java.util.ArrayList;
import java.util.List;

import com.vumi.entity.Policy;
import com.vumi.interfaces.PolicyComponent;

public class DefaultPolicyComponent implements PolicyComponent {

    @Override
    public List<Policy> findAll( String issue ) {
        
        List<Policy> policies = new ArrayList<>();

        Policy p1 = new Policy();
        p1.setId(3L);
        p1.setIssueName("VUMIGROUP");
        p1.setPrice(300);
        p1.setEffectiveDate("2022-01-05");

        Policy p2 = new Policy();
        p2.setId(5L);
        p2.setIssueName("OTHER");
        p2.setPrice(378);
        p2.setEffectiveDate("2023-02-01");

        Policy p3 = new Policy();
        p3.setId(6L);
        p3.setIssueName("EXPACT");
        p3.setPrice(400);
        p3.setEffectiveDate("2023-02-06");
        
        policies.add(p1);
        policies.add(p1);
        policies.add(p3);

        return policies;
        
    }
    
}
