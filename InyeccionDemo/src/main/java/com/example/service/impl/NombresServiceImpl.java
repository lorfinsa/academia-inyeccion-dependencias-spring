package com.example.service.impl;

import com.example.repository.impl.DataRepositoryImpl;
import com.example.service.NombresService;
import org.springframework.stereotype.Service;

@Service
public class NombresServiceImpl implements NombresService {

    private final DataRepositoryImpl dataRepository;

    /**
     * Elsta implementación del service sólo "sabe" que necesita un
     * DataRepository, NO cómo se construye
     */
    public NombresServiceImpl(DataRepositoryImpl dataRepository) {
        this.dataRepository = dataRepository;
    }

    @Override
    public void imprimirNombres() {
        System.out.println("== NOMBRES ==");
        System.out.println(dataRepository.leerDatos());
    }

}
