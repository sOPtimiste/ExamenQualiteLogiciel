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
@Table(name = "produis")
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	
	
	public Set<DetailCommande> getDetailsCommandes() {
		return detailsCommandes;
	}

	public void setDetailsCommandes(Set<DetailCommande> detailsCommandes) {
		this.detailsCommandes = detailsCommandes;
	}

	@Column(name = "code_produit")
	private String code;
	
	private String designation;
	
	@Column(name = "prix_unitaire")
	private float prixUnitaire;
	
	@JsonBackReference
	@OneToMany(mappedBy = "produit")
	private Set<DetailCommande> detailsCommandes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public float getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	
	
	

}
