package com.order_processing_engine.domains;

import com.order_processing_engine.domains.enums.CustomerType;

public class Customer {
    private final String name;
    private final CustomerType type;

    public Customer(String name, CustomerType type) {
        this.name = name;
        this.type = type;
    }
}
