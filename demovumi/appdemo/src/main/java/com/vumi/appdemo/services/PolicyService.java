package com.vumi.appdemo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vumi.appdemo.exception.BadRequestException;
import com.vumi.appdemo.manager.PolicyManager;
import com.vumi.entity.Policy;
import com.vumi.interfaces.PolicyComponent;

@Service
public class PolicyService {
    
    public List<Policy> findAll( String issue ) throws Exception {

        PolicyComponent component = PolicyManager
            .getInstance().getPolicyComponent( issue );

        if( component == null ) {
            throw new BadRequestException("No existe un componente para obtener datos del issue " + issue);
        }

       return component.findAll(issue);

    }
    
}
