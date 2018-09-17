package com.example.repository.impl;

import com.example.repository.impl.FileSystemRepositoryImpl;
import com.example.repository.impl.DatabaseRepositoryImpl;
import com.example.repository.DataRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class DataRepositoryImpl implements DataRepository {

    private final DatabaseRepositoryImpl databaseRepository;
    private final FileSystemRepositoryImpl fileSystemRepository;
    private final AdministradorRepository administradorRepository;

    public DataRepositoryImpl(DatabaseRepositoryImpl databaseRepository, FileSystemRepositoryImpl fileSystemRepository, AdministradorRepository administradorRepository) {
        this.databaseRepository = databaseRepository;
        this.fileSystemRepository = fileSystemRepository;
        this.administradorRepository = administradorRepository;
    }

    @Override
    public List<String> leerDatos() {
        List<String> datosDB = databaseRepository.leerDatos();
        List<String> datosFS = fileSystemRepository.leerDatos();
        String nombreAdmin = administradorRepository.obtenerNombre();
        ArrayList<String> datos = new ArrayList<>();
        datos.addAll(datosDB);
        datos.addAll(datosFS);
        datos.add(nombreAdmin);
        return datos;
    }

}
