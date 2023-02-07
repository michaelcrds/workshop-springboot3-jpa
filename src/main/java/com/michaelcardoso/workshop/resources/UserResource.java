package com.michaelcardoso.workshop.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.michaelcardoso.workshop.entities.User;
import com.michaelcardoso.workshop.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> listAll(){
		List<User> list = userService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = userService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}