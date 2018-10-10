package com.example.repository;

import com.example.domain.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaJpaRepository extends JpaRepository<Persona, Long> {

    //query method para buscar personas por nombre, ordenadas por descripcion de rol
    List<Persona> findByNombreIgnoreCaseOrderByRolDescripcionDesc(String unNombre);
    
}
