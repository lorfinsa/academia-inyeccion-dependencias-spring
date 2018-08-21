package com.example.repository;

import static java.util.Arrays.asList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * Encapsula el acceso a datos en DB
 */
@Component
public class DatabaseRepository {

    public List<String> leerDatos() {
        return asList("Jose", "Alberto", "Miguel");
    }

}
