package com.vumi.interfaces;

import java.util.List;

import com.vumi.entity.Policy;

public interface PolicyComponent {
    
    List<Policy> findAll ( String issue );
    
}
