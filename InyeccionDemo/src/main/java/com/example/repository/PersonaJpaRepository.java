package com.example.repository;

import com.example.domain.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaJpaRepository extends JpaRepository<Persona, Long> {

   
    //public void findByFirstnameContaining(String nombre);
    
     List<Persona> findByNombreContaining(String unNombre);
    

}
