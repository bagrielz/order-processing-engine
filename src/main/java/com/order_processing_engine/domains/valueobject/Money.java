package com.order_processing_engine.domains.valueobject;

import com.order_processing_engine.domains.exceptions.MoneyNotPositiveException;

import java.math.BigDecimal;

public class Money {
    private final BigDecimal value;

    public Money(BigDecimal value) {
        // Valida se o valor passado é menor do que zero
        if (value.compareTo(BigDecimal.ZERO) < 0) {
            throw new MoneyNotPositiveException();
        }

        this.value = value;
    }

    public Money multiply(int quantity) {
        // Multiplica o valor * quantidade com precisão, evitando erros de ponto flutuante
        return new Money(this.value.multiply(BigDecimal.valueOf(quantity)));
    }

    public Money applyPercentageDiscount(BigDecimal percentage) {
        var discount = value.multiply(percentage);
        return new Money(value.subtract(discount));
    }

    public Money applyPercentageIncrease(BigDecimal percentage) {
        var increase = value.multiply(percentage);
        return new Money(value.add(increase));
    }

    public BigDecimal getValue() {
        return value;
    }
}
