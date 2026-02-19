package com.order_processing_engine.domains;

import com.order_processing_engine.domains.enums.OrderStatus;
import com.order_processing_engine.domains.valueobject.ShippingState;

import java.util.List;
import java.util.UUID;

public class Order {
    private final UUID id;
    private final Customer customer;
    private final List<OrderItem> items;
    private final ShippingState shippingState;
    private final OrderStatus status;

    public Order(UUID id, Customer customer, List<OrderItem> items, ShippingState shippingState) {
        this.id = id;
        this.customer = customer;
        this.items = items;
        this.shippingState = shippingState;
        this.status = OrderStatus.COMPLETED;
    }
}
