package com.example.service;

import com.example.repository.DataRepository;
import java.util.List;
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

    public List<String> imprimirNombres() {
        return dataRepository.leerDatos();
    }

}
