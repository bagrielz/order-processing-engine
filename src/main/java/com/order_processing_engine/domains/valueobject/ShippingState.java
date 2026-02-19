package com.order_processing_engine.domains.valueobject;

import com.order_processing_engine.domains.enums.Uf;

import java.math.BigDecimal;

public class ShippingState {
    private final Uf value;

    public ShippingState(Uf value) {
        if (value == null) {
            throw new IllegalArgumentException("O estado de envio não pode ser nulo");
        }

        this.value = value;
    }

    public BigDecimal shippingTaxPercentage() {
        return value.shippingTaxPercentage();
    }
}
