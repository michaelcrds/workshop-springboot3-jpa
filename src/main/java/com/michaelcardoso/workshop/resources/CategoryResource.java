package com.michaelcardoso.workshop.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.michaelcardoso.workshop.entities.Category;
import com.michaelcardoso.workshop.services.CategoryService;

@RestController
@RequestMapping(value="/categories")
public class CategoryResource {
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
	public ResponseEntity<List<Category>> listAll(){
		List<Category> list = categoryService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = categoryService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
