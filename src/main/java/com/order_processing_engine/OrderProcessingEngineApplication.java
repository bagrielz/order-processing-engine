package com.order_processing_engine;

import com.order_processing_engine.domains.OrderItem;
import com.order_processing_engine.domains.valueobject.Money;
import com.order_processing_engine.domains.valueobject.Quantity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class OrderProcessingEngineApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OrderProcessingEngineApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var quantity = new Quantity(2);
		var unitPrice = new Money(new BigDecimal("100"));

		var item = new OrderItem("Mouse", quantity, unitPrice);
		System.out.println(item.totalValue().getValue());
	}
}
