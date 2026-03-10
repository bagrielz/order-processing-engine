package com.order_processing_engine.dtos;

import java.math.BigDecimal;

public record OrderItemDTO(String productName, int quantity, BigDecimal unitPrice) {
}
