package com.order_processing_engine.domains.enums;

public enum OrderStatus {
    CREATED {
        @Override
        boolean canTransitionTo(OrderStatus next) {
            return next == VALIDATED || next == REJECTED;
        }
    },
    VALIDATED {
        @Override
        boolean canTransitionTo(OrderStatus next) {
            return next == CALCULATED || next == REJECTED;
        }
    },
    CALCULATED {
        @Override
        boolean canTransitionTo(OrderStatus next) {
            return next == COMPLETED || next == REJECTED;
        }
    },
    COMPLETED {
        @Override
        boolean canTransitionTo(OrderStatus next) {
            return next == VALIDATED || next == REJECTED;
        }
    },
    REJECTED {
        @Override
        boolean canTransitionTo(OrderStatus next) {
            return false;
        }
    };

    abstract boolean canTransitionTo(OrderStatus next);
}
