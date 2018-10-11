package com.example.service;

import com.example.domain.*;
import java.util.*;

public interface NombresService {

    void imprimirNombres();
    
    void crearPersonas(Persona per);
    
     void obtenerPersonasQueContengan(String nombre);

}
