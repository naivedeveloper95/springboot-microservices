package com.springbootmsvs.inventoryservice;

import com.springbootmsvs.inventoryservice.model.Inventory;
import com.springbootmsvs.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("iPhone_13");
			inventory.setQuantity(100);

			Inventory invent = new Inventory();
			invent.setSkuCode("iPhone_13_red");
			invent.setQuantity(0);

			inventoryRepository.save(inventory);
			inventoryRepository.save(invent);
		};
	}

}

