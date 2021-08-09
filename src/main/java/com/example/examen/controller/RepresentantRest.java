package com.example.examen.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.entities.Representant;
import com.example.examen.repositories.RepresentantRepository;

@RestController
public class RepresentantRest {
	
	@Resource
	private RepresentantRepository rtr;
	
	
	@GetMapping("/findOneRepresentant/{id}")
	public Optional<Representant> findById(@PathVariable Long id)
	{
		return rtr.findById(id);
	}
	
	@GetMapping("/findAllRepresentant")
	public List<Representant> findAll() {
		
		return rtr.findAll();
		
	}
	@PostMapping("/saveRepresentant")
	public Representant save(@RequestBody Representant representant) {
		
		return rtr.save(representant);
	}
	
	@PostMapping("/updateRepresentant")
	public Representant update(@RequestBody Representant representant) {
		
		return rtr.save(representant);
	}
	
	@PostMapping("/deleteRepresentant")
	public void delete(@RequestBody Representant representant) {
		
		rtr.delete(representant);
	}

}
