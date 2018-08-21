package javatradicional.repository;

import static java.util.Arrays.asList;
import java.util.List;

/**
 * Encapsula el acceso a datos en DB
 */
public class DatabaseRepository {

    public List<String> leerDatos() {
        return asList("Jose", "Alberto", "Miguel");
    }

}
