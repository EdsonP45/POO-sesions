package mx.utng.s290;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Ejercicio2 {
    

    List<Integer> trasnformar (Iterable<Integer>conjunto,Function<Integer, Integer> function){
        List<Integer> nuevaLista = new ArrayList<>();
        for (Integer value : conjunto){
            nuevaLista.add(value);
        }



        return nuevaLista;
    }

    Integer trasnformarYSumar (Iterable<Integer> conjunto, Function <Integer, Integer> funcion){
        Integer acumulador = 0;
        for (Integer value : conjunto) {
            acumulador += funcion.apply(value);
        }
        return acumulador;
    }


}
