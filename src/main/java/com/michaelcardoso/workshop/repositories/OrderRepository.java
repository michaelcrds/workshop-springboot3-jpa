package com.michaelcardoso.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michaelcardoso.workshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
