package com.example.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.examen.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
