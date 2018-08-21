package javatradicional;

import javatradicional.repository.DataRepository;
import javatradicional.repository.DatabaseRepository;
import javatradicional.repository.FileSystemRepository;
import javatradicional.service.NombresService;

public class Application {

    public static void main(String[] args) {
        //Para usar el service, tengo que "conocer" cómo se construyen sus dependencias
        //Va contra el principio de abstracción de la separación en capas de una aplicación
        DatabaseRepository databaseRepository = new DatabaseRepository();
        FileSystemRepository fileSystemRepository = new FileSystemRepository();
        DataRepository dataRepository = new DataRepository(databaseRepository, fileSystemRepository);

        NombresService busquedaService = new NombresService(dataRepository);
        busquedaService.imprimirNombres();
    }

}
