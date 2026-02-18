package com.order_processing_engine.domains.valueobject;

import java.math.BigDecimal;

public class Money {
    private final BigDecimal value;

    public Money(BigDecimal value) {
        // Valida se o valor passado é menor do que zero
        if (value.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Valor não pode ser negativo");
        }

        this.value = value;
    }

    public Money multiply(int quantity) {
        // Multiplica o valor * quantidade com precisão, evitando erros de ponto flutuante
        return new Money(this.value.multiply(BigDecimal.valueOf(quantity)));
    }

    public BigDecimal getValue() {
        return value;
    }
}
