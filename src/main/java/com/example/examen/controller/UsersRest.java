package com.example.examen.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.entities.Users;
import com.example.examen.repositories.UserRepository;


@RestController
public class UsersRest {

	private UserRepository urr;
	
	@GetMapping("/findOneUsers/{id}")
	public Optional<Users> findById(@PathVariable Long id)
	{
		return urr.findById(id);
	}
	
	@GetMapping("/findAllUsers")
	public List<Users> findAll() {
		
		return urr.findAll();
		
	}
	@PostMapping("/saveUsers")
	public Users save(@RequestBody Users Users) {
		
		return urr.save(Users);
	}
	
	@PostMapping("/updateUsers")
	public Users update(@RequestBody Users Users) {
		
		return urr.save(Users);
	}
	
	@PostMapping("/deleteUsers")
	public void delete(@RequestBody Users Users) {
		
		urr.delete(Users);
	}
	

}
