package com.order_processing_engine.domains.exceptions;

public class QuantityNotPositiveException extends RuntimeException {
    public QuantityNotPositiveException() {
        super("Quantidade precisa ser maior que zero");
    }
}
