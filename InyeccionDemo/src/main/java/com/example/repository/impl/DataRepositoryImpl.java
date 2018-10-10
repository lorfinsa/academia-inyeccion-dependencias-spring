package com.example.repository.impl;

import com.example.domain.Persona;
import com.example.repository.DataRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class DataRepositoryImpl implements DataRepository {

    private final DatabaseRepositoryImpl databaseRepository;
    private final FileSystemRepositoryImpl fileSystemRepository;

    public DataRepositoryImpl(DatabaseRepositoryImpl databaseRepository, FileSystemRepositoryImpl fileSystemRepository) {
        this.databaseRepository = databaseRepository;
        this.fileSystemRepository = fileSystemRepository;
    }

    @Override
    public List<Persona> leerDatos() {
        List<Persona> datosDB = databaseRepository.leerDatos();
        List<Persona> datosFS = fileSystemRepository.leerDatos();
        ArrayList<Persona> datos = new ArrayList<>();
        datos.addAll(datosDB);
        datos.addAll(datosFS);
        return datos;
    }

}
