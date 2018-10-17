package com.example.service;

import com.example.domain.Persona;
import java.util.List;

public interface PersonaService {

    void imprimirNombres();
    
    List<Persona> obtenerTodasLasPersonas();
    
    void createPersona(Persona per);
    
    void actualizarPersona(Persona personaNueva);

}
