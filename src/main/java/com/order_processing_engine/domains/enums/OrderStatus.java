package com.order_processing_engine.domains.enums;

public enum OrderStatus {
    CREATED {
        @Override
        public boolean canTransitionTo(OrderStatus next) {
            return next == VALIDATED || next == REJECTED;
        }
    },
    VALIDATED {
        @Override
        public boolean canTransitionTo(OrderStatus next) {
            return next == CALCULATED || next == REJECTED;
        }
    },
    CALCULATED {
        @Override
        public boolean canTransitionTo(OrderStatus next) {
            return next == COMPLETED || next == REJECTED;
        }
    },
    COMPLETED {
        @Override
        public boolean canTransitionTo(OrderStatus next) {
            return next == VALIDATED || next == REJECTED;
        }
    },
    REJECTED {
        @Override
        public boolean canTransitionTo(OrderStatus next) {
            return false;
        }
    };

    public abstract boolean canTransitionTo(OrderStatus next);
}
