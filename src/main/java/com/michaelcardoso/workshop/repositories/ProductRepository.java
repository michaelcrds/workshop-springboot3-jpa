package com.michaelcardoso.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michaelcardoso.workshop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
