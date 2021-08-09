package com.example.examen.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.entities.Commande;
import com.example.examen.repositories.CommendeRepository;

@RestController
public class CommandeRest {
	
	@Resource
	private CommendeRepository cdr;
	
	
	@GetMapping("/findOneCommande/{id}")
	public Optional<Commande> findById(@PathVariable Long id)
	{
		return cdr.findById(id);
	}
	
	@GetMapping("/findAllCommande")
	public List<Commande> findAll() {
		
		return cdr.findAll();
		
	}
	@PostMapping("/saveCommande")
	public Commande save(@RequestBody Commande commande) {
		
		return cdr.save(commande);
	}
	
	@PostMapping("/updateCommande")
	public Commande update(@RequestBody Commande commande) {
		
		return cdr.save(commande);
	}
	
	@PostMapping("/deleteCommande")
	public void delete(@RequestBody Commande commande) {
		
		cdr.delete(commande);
	}

}
