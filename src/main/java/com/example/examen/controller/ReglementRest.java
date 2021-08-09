package com.example.examen.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.entities.Reglement;
import com.example.examen.repositories.ReglementRepository;
@RestController
public class ReglementRest {
	
	private ReglementRepository rtr;
	
	
	@GetMapping("/findOneReglement/{id}")
	public Optional<Reglement> findById(@PathVariable Long id)
	{
		return rtr.findById(id);
	}
	
	@GetMapping("/findAllReglement")
	public List<Reglement> findAll() {
		
		return rtr.findAll();
		
	}
	@PostMapping("/saveReglement")
	public Reglement save(@RequestBody Reglement Reglement) {
		
		return rtr.save(Reglement);
	}
	
	@PostMapping("/updateReglement")
	public Reglement update(@RequestBody Reglement Reglement) {
		
		return rtr.save(Reglement);
	}
	
	@PostMapping("/deleteReglement")
	public void delete(@RequestBody Reglement Reglement) {
		
		rtr.delete(Reglement);
	}

}
