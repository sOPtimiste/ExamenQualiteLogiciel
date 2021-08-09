package com.example.examen.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "commandes")
public class Commande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "numero_commande")
	private String numero;
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Set<Reglement> getReglements() {
		return reglements;
	}

	public void setReglements(Set<Reglement> reglements) {
		this.reglements = reglements;
	}

	public Set<DetailCommande> getDetailCommandes() {
		return detailCommandes;
	}

	public void setDetailCommandes(Set<DetailCommande> detailCommandes) {
		this.detailCommandes = detailCommandes;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "creation_date")
	private Date creationDate;
	
	@Column(name = "montant_commande")
	private float montant;
	
	@Column(name = "reliquat_commande")
	private float reliquat;
	
	@ManyToOne
	private Client client;
	
	@JsonBackReference
	@OneToMany(mappedBy = "commande")
	private Set<Reglement> reglements;
	
	@JsonBackReference
	@OneToMany(mappedBy = "commande")
	private Set<DetailCommande> detailCommandes;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public float getReliquat() {
		return reliquat;
	}

	public void setReliquat(float reliquat) {
		this.reliquat = reliquat;
	}

	
	

}
