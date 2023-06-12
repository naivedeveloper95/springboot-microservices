package com.springbootmsvs.orderservice.repository;

import com.springbootmsvs.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
