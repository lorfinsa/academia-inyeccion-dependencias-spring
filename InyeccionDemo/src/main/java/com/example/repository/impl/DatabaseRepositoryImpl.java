package com.example.repository.impl;

import com.example.domain.Persona;
import static java.util.Arrays.asList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * Encapsula el acceso a datos en DB
 */
@Repository
public class DatabaseRepositoryImpl {

    public List<Persona> leerDatos() {
        return asList(new Persona("Jose"), new Persona("Alberto"), new Persona("Miguel"));
    }

}
