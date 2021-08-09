package com.example.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.examen.entities.DetailCommande;

public interface DetailCommandeRepository extends JpaRepository<DetailCommande, Long> {

}
