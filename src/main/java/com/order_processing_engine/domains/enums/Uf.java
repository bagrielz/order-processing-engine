package com.order_processing_engine.domains.enums;

import java.math.BigDecimal;

public enum Uf {
    RJ {
        public BigDecimal shippingTaxPercentage() {
            return new BigDecimal("0.17");
        }
    },
    SP {
        public BigDecimal shippingTaxPercentage() {
            return new BigDecimal("0.15");
        }
    },
    MG {
        public BigDecimal shippingTaxPercentage() {
            return new BigDecimal("0.12");
        }
    };

    public abstract BigDecimal shippingTaxPercentage();
}
