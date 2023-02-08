package com.michaelcardoso.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michaelcardoso.workshop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
