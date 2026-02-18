package com.order_processing_engine;

import com.order_processing_engine.domains.OrderItem;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderProcessingEngineApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OrderProcessingEngineApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var item = new OrderItem("Mouse", 2, 100);
		System.out.println(item.totalValue());
	}
}
