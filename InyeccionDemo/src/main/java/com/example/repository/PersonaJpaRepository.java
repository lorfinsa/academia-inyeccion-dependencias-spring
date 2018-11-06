package com.example.repository;

import com.example.domain.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// En este caso la anotación es opcional. Spring ya detecta que la clase extiende de un JPARepository.
public interface PersonaJpaRepository extends JpaRepository<Persona, Long> {

    //query method para buscar personas por nombre, ordenadas por descripcion de rol
    List<Persona> findByNombreIgnoreCaseOrderByRolDescripcionDesc(String unNombre);

}
