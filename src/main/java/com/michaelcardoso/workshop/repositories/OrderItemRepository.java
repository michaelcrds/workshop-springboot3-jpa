package com.michaelcardoso.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michaelcardoso.workshop.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
