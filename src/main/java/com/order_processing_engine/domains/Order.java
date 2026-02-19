package com.order_processing_engine.domains;

import com.order_processing_engine.domains.valueobject.ShippingState;

import java.util.List;
import java.util.UUID;

public class Order {
    private final UUID id;
    private final Customer customer;
    private final List<OrderItem> orderItemsList;
    private final ShippingState shippingState;
}
