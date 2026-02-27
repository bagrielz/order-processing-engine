package com.order_processing_engine.domains.enums;

import java.math.BigDecimal;

public enum CustomerType {
    NORMAL {
        @Override
        public BigDecimal discountPercentage() {
            return BigDecimal.ZERO;
        }
    },
    PREMIUM {
        @Override
        public BigDecimal discountPercentage() {
            return new BigDecimal("0.10");
        }
    },
    VIP {
        @Override
        public BigDecimal discountPercentage() {
            return new BigDecimal("0.15");
        }
    };

    public abstract BigDecimal discountPercentage();
}
