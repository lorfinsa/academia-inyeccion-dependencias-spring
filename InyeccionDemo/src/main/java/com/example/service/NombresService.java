package com.example.service;

import com.example.domain.Persona;

public interface NombresService {

    void imprimirNombres();
    
    void createPersona(Persona per);
    
    void actualizarPersona(Persona personaNueva);

}
