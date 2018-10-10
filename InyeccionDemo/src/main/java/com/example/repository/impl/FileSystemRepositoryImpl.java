package com.example.repository.impl;

import com.example.domain.Persona;
import static java.util.Arrays.asList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * Encapsula el acceso a datos en FS
 */
@Repository
public class FileSystemRepositoryImpl {

    public List<Persona> leerDatos() {
        return asList(new Persona("Pepe"), new Persona("Luis"), new Persona("Armando"));
    }
}
