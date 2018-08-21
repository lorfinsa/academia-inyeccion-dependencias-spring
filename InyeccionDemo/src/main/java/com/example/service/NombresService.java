package com.example.service;

import com.example.repository.DataRepository;
import org.springframework.stereotype.Component;

@Component
public class NombresService {

    private final DataRepository dataRepository;

    /**
     * El service sólo "sabe" que necesita un DataRepository, NO cómo se
     * construye
     */
    public NombresService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public void imprimirNombres() {
        System.out.println("== NOMBRES ==");
        System.out.println(dataRepository.leerDatos());
    }

}
