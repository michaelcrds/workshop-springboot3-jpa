package com.michaelcardoso.workshop.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.michaelcardoso.workshop.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> listAll(){
		User u = new User(1L, "Michael", "michael@teste", "9999999", "12345");
		return ResponseEntity.ok().body(u);
	}
}
