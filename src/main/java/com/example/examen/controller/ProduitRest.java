package com.example.examen.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.entities.Produit;
import com.example.examen.repositories.ProduitRepository;
@RestController
public class ProduitRest {
	@Resource
	private ProduitRepository ptr;
	
	
	@GetMapping("/findOneProduit/{id}")
	public Optional<Produit> findById(@PathVariable Long id)
	{
		return ptr.findById(id);
	}
	
	@GetMapping("/findAllProduit")
	public List<Produit> findAll() {
		
		return ptr.findAll();
		
	}
	@PostMapping("/saveProduit")
	public Produit save(@RequestBody Produit produit) {
		
		return ptr.save(produit);
	}
	
	@PostMapping("/updateProduit")
	public Produit update(@RequestBody Produit produit) {
		
		return ptr.save(produit);
	}
	
	@PostMapping("/deleteProduit")
	public void delete(@RequestBody Produit produit) {
		
		ptr.delete(produit);
	}

}
