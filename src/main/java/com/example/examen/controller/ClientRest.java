package com.example.examen.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.entities.Client;
import com.example.examen.repositories.ClientRepository;

@RestController
public class ClientRest {
	
	@Resource
	private ClientRepository ctr;
	
	@GetMapping("/findOneClient/{id}")
	public Optional<Client> findById(@PathVariable Long id)
	{
		return ctr.findById(id);
	}
	
	@GetMapping("/findAllClient")
	public List<Client> findAll() {
		
		return ctr.findAll();
		
	}
	@PostMapping("/saveClient")
	public Client save(@RequestBody Client client) {
		
		return ctr.save(client);
	}
	
	@PostMapping("/updateClient")
	public Client update(@RequestBody Client client) {
		
		return ctr.save(client);
	}
	
	@PostMapping("/deleteClient")
	public void delete(@RequestBody Client client) {
		
		ctr.delete(client);
	}

}
