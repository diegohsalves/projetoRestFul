package com.example.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;

//indica que essa classe é um recurso web que é implementado por um controlador rest
@RestController

//nome do recurso

@RequestMapping(value = "/users")
public class UserResource {
	
	//essa annotation indica que este é o método que responde ao tipo get do http do tipo users
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1L, "Diego","diegoalves@gmail.com", "34998188488", "123456");
		return ResponseEntity.ok().body(u);
	}
}
