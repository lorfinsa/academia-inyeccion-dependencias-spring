package com.example.repository.impl;

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
    public List<String> leerDatos() {
        List<String> datosDB = databaseRepository.leerDatos();
        List<String> datosFS = fileSystemRepository.leerDatos();
        ArrayList<String> datos = new ArrayList<>();
        datos.addAll(datosDB);
        datos.addAll(datosFS);
        return datos;
    }

}
