package com.example.repository.impl;

import static java.util.Arrays.asList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * Encapsula el acceso a datos en FS
 */
@Repository
public class FileSystemRepositoryImpl {

    public List<String> leerDatos() {
        return asList("Pepe", "Luis", "Armando");
    }
}
