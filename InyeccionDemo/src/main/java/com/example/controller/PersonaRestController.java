package com.example.controller;

import com.example.domain.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.service.PersonaService;

@RestController
public class PersonaRestController {

    @Autowired
    PersonaService nombresService;
        
    @GetMapping("/api/personas")
    public List<Persona> obtenerPersonas() {
        List<Persona> personas = nombresService.obtenerTodasLasPersonas();
        return personas;
    }
    
}
