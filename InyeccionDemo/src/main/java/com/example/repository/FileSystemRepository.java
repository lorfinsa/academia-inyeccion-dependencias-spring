package com.example.repository;

import static java.util.Arrays.asList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * Encapsula el acceso a datos en FS
 */
@Component
public class FileSystemRepository {

    public List<String> leerDatos() {
        return asList("Pepe", "Luis", "Armando");
    }
}
