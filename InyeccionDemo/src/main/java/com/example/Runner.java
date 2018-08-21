package com.example;

import com.example.service.NombresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Es el componente que Spring ejecuta al iniciar su contexto por implementar
 * CommandLineRunner
 */
@Component
public class Runner implements CommandLineRunner {

    /**
     * Al declarar un componente como Autowired, Spring se encarga de instanciar
     * todo lo necesario para usarlo. Al igual que ponerlo en el constructor
     */
    @Autowired
    private NombresService busquedaService;

    @Override
    public void run(String... strings) throws Exception {

        busquedaService.imprimirNombres();

    }
}
