package mx.utng.s290;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Ejercicio1Tests {

    @Test
    @DisplayName ("suma dos cadenas convertidas a enteros")
    void addUpwoInteger(){
    String a = "4";
    String b = "8";

    Integer expected = 12;
    Ejercicio1 ejercicio = new Ejercicio1();

    assertEquals( expected, ejercicio.sumar (a,b));

}

    

}
