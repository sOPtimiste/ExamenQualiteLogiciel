package com.example.examen.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.entities.DetailCommande;
import com.example.examen.repositories.DetailCommandeRepository;


@RestController
public class DetailCommandeRest {
	@Resource
	private DetailCommandeRepository dcr;
	
	
	@GetMapping("/findOneDetailCommande/{id}")
	public Optional<DetailCommande> findById(@PathVariable Long id)
	{
		return dcr.findById(id);
	}
	
	@GetMapping("/findAllDetailCommande")
	public List<DetailCommande> findAll() {
		
		return dcr.findAll();
		
	}
	@PostMapping("/saveDetailCommande")
	public DetailCommande save(@RequestBody DetailCommande DetailCommande) {
		
		return dcr.save(DetailCommande);
	}
	
	@PostMapping("/updateDetailCommande")
	public DetailCommande update(@RequestBody DetailCommande DetailCommande) {
		
		return dcr.save(DetailCommande);
	}
	
	@PostMapping("/deleteDetailCommande")
	public void delete(@RequestBody DetailCommande DetailCommande) {
		
		dcr.delete(DetailCommande);
	}


}
