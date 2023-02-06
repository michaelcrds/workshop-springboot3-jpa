package com.michaelcardoso.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michaelcardoso.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
