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

    private OrderStatus status;

    public Order(UUID id, Customer customer, List<OrderItem> items, ShippingState shippingState) {
        if (items == null || items.isEmpty()) {
            throw new IllegalArgumentException("O pedido deve conter pelo menos um item");
        }

        this.id = id;
        this.customer = customer;
        this.items = items;
        this.shippingState = shippingState;
        this.status = OrderStatus.CREATED;
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

    public void changeStatusTo(OrderStatus next) {
        if (!status.canTransitionTo(next)) {
            throw new IllegalStateException("Transição inválida de " + status + " para " + next);
        }

        this.status = next;
    }
}
