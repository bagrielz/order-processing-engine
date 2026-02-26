package com.order_processing_engine.domains.exceptions;

public class NullShippingStateException extends RuntimeException {
    public NullShippingStateException() {
        super("O estado de envio não pode ser nulo");
    }
}
