package com.example.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * Encapsula el acceso a datos en general
 */
@Component
public class DataRepository {

    private final DatabaseRepository databaseRepository;
    private final FileSystemRepository fileSystemRepository;

    public DataRepository(DatabaseRepository databaseRepository, FileSystemRepository fileSystemRepository) {
        this.databaseRepository = databaseRepository;
        this.fileSystemRepository = fileSystemRepository;
    }

    public List<String> leerDatos() {
        List<String> datosDB = databaseRepository.leerDatos();
        List<String> datosFS = fileSystemRepository.leerDatos();
        ArrayList<String> datos = new ArrayList<>();
        datos.addAll(datosDB);
        datos.addAll(datosFS);
        return datos;
    }

}
