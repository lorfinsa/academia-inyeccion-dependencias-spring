package com.example;

import com.example.service.NombresService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Es el componente que Spring ejecuta al iniciar su contexto por implementar
 * CommandLineRunner
 */
@Component
public class Runner implements CommandLineRunner {

    private final NombresService busquedaService;

    /**
     * Al declarar un componente en el constructor, Spring se encarga de
     * instanciar todo lo necesario para usarlo
     */
    public Runner(NombresService busquedaService) {
        this.busquedaService = busquedaService;
    }

    @Override
    public void run(String... strings) throws Exception {

        System.out.println(busquedaService.imprimirNombres());

    }
}
