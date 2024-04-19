package mx.utng.s28.persistence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mx.utng.s28.model.Equipo;

@SpringBootTest
@ComponentScan (basePackageClasses = "mx.utng.s28")
@ExtendWith (SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class EquipoRepositoryTest {
    private EquipoRepository repository;

    @BeforeAll
    void cleanDatabase(){
        repository.deleteAll();
    }

    @Test
    void canSave (){
        //instancio un equipo 
        Equipo  equipo =  new Equipo();
        equipo.setNombre("America");

        //Guardo el equipo
        equipo = repository.save(equipo);

        //Prueba existencia in ID en ese equipo 
         assertNotNull( equipo.getId());
    }

    @Test
    @DisplayName ("Buscar por nombre")
    void canFinByName (){

        String name = "America";
    
        Equipo equipo = new Equipo();
        equipo.setNombre(name);
        repository.save(equipo);

        Iterable <Equipo> listaEquipos = repository.findAllByNombre(name);

        assertTrue(listaEquipos.iterator().hasNext());

        Equipo equipoEncontrado = listaEquipos.iterator().next();
        assertEquals(listaEquipos, equipoEncontrado);
    }
}
