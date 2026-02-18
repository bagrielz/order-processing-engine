package com.order_processing_engine.domains.valueobject;

public class Quantity {
    private final int value;

    public Quantity(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Quantidade precisa ser maior que zero");
        }

        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
