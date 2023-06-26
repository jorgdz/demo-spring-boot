package com.vumi.entity;

public class Policy {
    
    private Long Id;

    private double price;

    private String effectiveDate;

    private String issueName;

    public Long getId() {
        return this.Id;
    }

    public void setId ( Long id ) {
        this.Id = id;
    }

    public double getPrice () {
        return this.price;
    }

    public void setPrice ( double price ) {
        this.price = price;
    }
    
    public String getEffectiveDate () {
        return this.effectiveDate;
    }

    public void setEffectiveDate ( String effectiveDate ) {
        this.effectiveDate = effectiveDate;
    }
    
    public String getIssueName () {
        return this.issueName;
    }

    public void setIssueName ( String issueName ) {
        this.issueName = issueName;
    }

}
