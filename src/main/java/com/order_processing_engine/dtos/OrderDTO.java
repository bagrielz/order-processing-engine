package com.order_processing_engine.dtos;

import java.util.List;

public record OrderDTO(String id, CustomerDTO customer, List<OrderItemDTO> items, String shippingState) {
}
