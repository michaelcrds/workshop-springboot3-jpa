package com.michaelcardoso.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michaelcardoso.workshop.entities.User;
import com.michaelcardoso.workshop.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return userRepository.save(obj);
	}
	
	public void delete(User obj) {
		userRepository.deleteById(obj.getId());
	}
}
