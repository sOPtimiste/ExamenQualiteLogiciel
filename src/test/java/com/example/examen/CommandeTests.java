package com.example.examen;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.examen.entities.Client;
import com.example.examen.entities.Commande;
import com.example.examen.entities.DetailCommande;
import com.example.examen.entities.Reglement;
import com.example.examen.repositories.CommendeRepository;

@DataJpaTest
@AutoConfigureTestDatabase
public class CommandeTests {
	
	@Autowired
	private CommendeRepository repo;
	
	@Test
	public void testCreateCommande() {
		
		Commande commande = new Commande();
		
		commande.setNumero("cmd001");
		commande.setMontant(3500);
		commande.setReliquat(3000);
		
		Client c = new Client();
		c.setCodeClient("codeSN");
		c.setNomClient("MBACKE");
		commande.setClient(c);
		
		Set<DetailCommande> dc = null;
		
		 Iterator<DetailCommande> iterator = dc.iterator();
		 
		 
		
		
		
		
		
		repo.save(commande);
	}
	
	
	@Test
	public void testFindCommandeByNumeroExist() {
		
		// le numero de la commande cmd0012 se trouve dans la base de donnees
		
		String numero = "cmd0012";
		
		//trouver le numero de la commande 
		
		Commande commande = repo.findByNumero(numero);
		//faire une comparaison entre le numero depuis la bdd et cmd0012
		
		assertThat(commande.getNumero()).isEqualTo(numero);
	}
	
	@Test
	public void testFindCommandeByNumeroNotExist() {
		
		// le numero de la commande cmd0012 se trouve dans la base de donnees
		
		String numero = "cmd0014";
		
		//trouver le numero de la commande 
		
		Commande commande = repo.findByNumero(numero);
		//faire une comparaison entre le numero depuis la bdd et cmd0012
		
		assertNull(commande);
	}
	
	

}
