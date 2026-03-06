package com.order_processing_engine.domains.exceptions;

import com.order_processing_engine.domains.enums.OrderStatus;

public class InvalidStatusTransitionException extends RuntimeException {
    public InvalidStatusTransitionException(OrderStatus current, OrderStatus next) {
        super("Transição inválida de " + current + " para " + next);
    }
}
