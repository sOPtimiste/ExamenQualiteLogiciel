package com.example.examen.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "representants")
public class Representant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "code_representant")
	private String codeRepresentant;
	
	public Set<Client> getClients() {
		return clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

	@Column(name = "nom_representant")
	private String nomRepresentant;
	
	@JsonBackReference
	@OneToMany(mappedBy = "representant")
	private Set<Client> clients;
	
	
	
	public Representant() {
		// TODO Auto-generated constructor stub
	}

	public Representant(String codeRepresentant, String nomRepresentant) {
		this.codeRepresentant = codeRepresentant;
		this.nomRepresentant = nomRepresentant;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodeRepresentant() {
		return codeRepresentant;
	}

	public void setCodeRepresentant(String codeRepresentant) {
		this.codeRepresentant = codeRepresentant;
	}

	public String getNomRepresentant() {
		return nomRepresentant;
	}

	public void setNomRepresentant(String nomRepresentant) {
		this.nomRepresentant = nomRepresentant;
	}



}
