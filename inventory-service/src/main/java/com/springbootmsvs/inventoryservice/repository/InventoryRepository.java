package com.springbootmsvs.inventoryservice.repository;

import com.springbootmsvs.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    Optional<Object> findBySkuCode(String skuCode);
}
