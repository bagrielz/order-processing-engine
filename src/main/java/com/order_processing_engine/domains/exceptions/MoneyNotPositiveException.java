package com.order_processing_engine.domains.exceptions;

public class MoneyNotPositiveException extends RuntimeException {
    public MoneyNotPositiveException() {
        super("Valor não pode ser negativo");
    }
}
