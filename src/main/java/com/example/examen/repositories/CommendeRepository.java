package com.example.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.examen.entities.Commande;

public interface CommendeRepository extends JpaRepository<Commande, Long> {

}
