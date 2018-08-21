package javatradicional.repository;

import static java.util.Arrays.asList;
import java.util.List;

/**
 * Encapsula el acceso a datos en FS
 */
public class FileSystemRepository {

    public List<String> leerDatos() {
        return asList("Pepe", "Luis", "Armando");
    }
}
