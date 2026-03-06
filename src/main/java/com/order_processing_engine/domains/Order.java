package com.order_processing_engine.domains;

import com.order_processing_engine.domains.enums.OrderStatus;
import com.order_processing_engine.domains.exceptions.EmptyOrderItemsException;
import com.order_processing_engine.domains.valueobject.ShippingState;

import java.util.List;
import java.util.UUID;

public class Order {
    private final String id;
    private final Customer customer;
    private final List<OrderItem> items;
    private final ShippingState shippingState;

    private OrderStatus current;

    public Order(String id, Customer customer, List<OrderItem> items, ShippingState shippingState) {
        if (items == null || items.isEmpty()) {
            throw new EmptyOrderItemsException();
        }

        this.id = id;
        this.customer = customer;
        this.items = List.copyOf(items);
        this.shippingState = shippingState;
        this.current = OrderStatus.CREATED;
    }

    public void validate() {
        changeStatusTo(OrderStatus.VALIDATED);
    }

    public void calculate() {
        changeStatusTo(OrderStatus.CALCULATED);
    }

    public void complete() {
        changeStatusTo(OrderStatus.COMPLETED);
    }

    public void reject() {
        changeStatusTo(OrderStatus.REJECTED);
    }

    private void changeStatusTo(OrderStatus next) {
        if (!current.canTransitionTo(next)) {
            throw new IllegalStateException("Transição inválida de " + current + " para " + next);
        }

        this.current = next;
    }
}
