package javatradicional.service;

import javatradicional.repository.DataRepository;

/**
 * Lógica de la aplicación: hacer la búsqueda de los nombres e imprimirlos
 */
public class NombresService {

    private final DataRepository dataRepository;

    public NombresService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public void imprimirNombres() {
        System.out.println(dataRepository.leerDatos());
    }

}
