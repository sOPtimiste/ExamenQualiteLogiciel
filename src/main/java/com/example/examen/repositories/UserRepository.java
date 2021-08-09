package com.example.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.examen.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

}
