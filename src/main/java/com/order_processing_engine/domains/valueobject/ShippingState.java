package com.order_processing_engine.domains.valueobject;

import com.order_processing_engine.domains.enums.Uf;
import com.order_processing_engine.domains.exceptions.NullShippingStateException;

import java.math.BigDecimal;

public class ShippingState {
    private final Uf value;

    public ShippingState(Uf value) {
        if (value == null) {
            throw new NullShippingStateException();
        }

        this.value = value;
    }

    public BigDecimal shippingTaxPercentage() {
        return value.shippingTaxPercentage();
    }

    public Uf uf() {
        return value;
    }
}
