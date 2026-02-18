package com.order_processing_engine.domains;

import com.order_processing_engine.domains.valueobject.Money;
import com.order_processing_engine.domains.valueobject.Quantity;

public class OrderItem {
    private final String productName;
    private final Quantity quantity;
    private final Money unitPrice;

    public OrderItem(String productName, Quantity quantity, Money unitPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public Money totalValue() {
        return unitPrice.multiply(quantity.getValue());
    }
}
