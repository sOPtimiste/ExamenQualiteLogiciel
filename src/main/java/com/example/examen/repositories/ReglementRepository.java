package com.example.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.examen.entities.Reglement;

public interface ReglementRepository extends JpaRepository<Reglement, Long> {

}
