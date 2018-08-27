package com.example.repository.impl;

import static java.util.Arrays.asList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * Encapsula el acceso a datos en DB
 */
@Repository
public class DatabaseRepositoryImpl {

    public List<String> leerDatos() {
        return asList("Jose", "Alberto", "Miguel");
    }

}
