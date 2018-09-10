package com.example.repository;

import com.example.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaJpaRepository extends JpaRepository<Persona, Long> {

}
