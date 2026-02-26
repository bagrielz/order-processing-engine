package com.order_processing_engine.domains.exceptions;

public class EmptyOrderItemsException extends RuntimeException {
    public EmptyOrderItemsException() {
        super("O pedido deve conter pelo menos um item");
    }
}
