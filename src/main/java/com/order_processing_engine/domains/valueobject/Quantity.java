package com.order_processing_engine.domains.valueobject;

import com.order_processing_engine.domains.exceptions.QuantityNotPositiveException;

public class Quantity {
    private final int value;

    public Quantity(int value) {
        if (value <= 0) {
            throw new QuantityNotPositiveException();
        }

        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
