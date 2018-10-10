package com.example.controller;

import com.example.domain.Persona;
import com.example.service.NombresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

/**
 * Es el componente que Spring ejecuta al iniciar su contexto por implementar
 * la interfaz CommandLineRunner
 */
@Controller
public class ConsoleController implements CommandLineRunner {

    /**
     * Al declarar un componente como Autowired, Spring se encarga de instanciar
     * todo lo necesario para usarlo. Al igual que ponerlo en el constructor
     */
    @Autowired
    private NombresService busquedaService;

    @Override
    public void run(String... strings) throws Exception {
                                
        //creacion de persona
        Persona persona = new Persona();
        persona.setNombre("Pepe");
        persona.setId(50L);
        busquedaService.createPersona(persona);
        
        //actualizacion de persona directa por id
        Persona personaActualizada = new Persona();
        personaActualizada.setNombre("PepeLui");
        personaActualizada.setId(50L);
        busquedaService.actualizarPersona(personaActualizada);

        //actualizacion de persona si existe
        Persona personaConMismoId = new Persona();
        personaConMismoId.setNombre("Sandra");
        personaConMismoId.setId(55L);
        busquedaService.actualizarPersona(personaConMismoId);
        
        //imprimir lista de personas
        busquedaService.imprimirNombres();
    }
}
