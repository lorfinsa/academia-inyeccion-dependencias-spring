package com.example.service.impl;

import com.example.domain.Persona;
import com.example.repository.PersonaJpaRepository;
import com.example.repository.impl.DataRepositoryImpl;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

    private final DataRepositoryImpl dataRepository;

    /**
     * Esta implementación del service sólo "sabe" que necesita un
     * DataRepository, NO cómo se construye
     */
    public PersonaServiceImpl(DataRepositoryImpl dataRepository) {
        this.dataRepository = dataRepository;
    }

    @Autowired
    private PersonaJpaRepository personaJpaRepository;

    @Override
    public void imprimirNombres() {
        System.out.println("== NOMBRES ==");
        System.out.println(dataRepository.leerDatos());
        System.out.println(personaJpaRepository.findAll());

        System.out.println("== BUSQUEDA ==");
        System.out.println(personaJpaRepository.findByNombreIgnoreCaseOrderByRolDescripcionDesc("Nestor"));
    }

    @Override
    public void createPersona(Persona per) {
        personaJpaRepository.save(per);
    }

    @Override
    public void actualizarPersona(Persona personaNueva) {

        Optional<Persona> supuestaPersona = personaJpaRepository.findById(personaNueva.getId());

        if (supuestaPersona.isPresent()) {
            personaJpaRepository.save(personaNueva);
        } else {
            System.out.println("Persona con id " + personaNueva.getId() + " no existe");
        }

    }

    @Override
    public List<Persona> obtenerTodasLasPersonas() {
        return personaJpaRepository.findAll();
    }

}
