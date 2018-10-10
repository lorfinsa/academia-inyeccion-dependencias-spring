package com.example.repository;

import com.example.domain.Persona;
import java.util.List;

/**
 * Encapsula el acceso a datos en general
 */
public interface DataRepository {

    public List<Persona> leerDatos();

}
