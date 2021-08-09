package com.example.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.examen.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
