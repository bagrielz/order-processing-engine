package com.order_processing_engine.domains;

import com.order_processing_engine.domains.enums.OrderStatus;
import com.order_processing_engine.domains.valueobject.ShippingState;

import java.util.List;
import java.util.UUID;

public class Order {
    private final UUID id;
    private final Customer customer;
    private final List<OrderItem> orderItemsList;
    private final ShippingState shippingState;

    public Order(UUID id, Customer customer, List<OrderItem> orderItemsList, ShippingState shippingState, OrderStatus orderStatus) {
        this.id = id;
        this.customer = customer;
        this.orderItemsList = orderItemsList;
        this.shippingState = shippingState;
    }
}
