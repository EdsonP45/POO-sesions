package mx.utng.s290;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class Ejercicio2Tests {

private final List<Integer> CONJUNTO = Arrays.asList(1,4,2,-7,9);
@Test
@DisplayName ("Transformando a negativos")
void negativos (){
    Ejercicio2 ejercicio2 = new Ejercicio2();
    List <Integer> real = ejercicio2.trasnformar(CONJUNTO, s -> -s);

    assertThat(real).containsExactly(-1,-4,-2,7,-9);

}
    @Test
    @DisplayName("Transformar cuadrados")
    void squares (){
        Ejercicio2 ejercicio2 = new Ejercicio2();
        List <Integer> real = ejercicio2.trasnformar(CONJUNTO, s -> -s);
        assertThat(real).containsExactly(-1,-4,-2,7,-9);


    }

    @Test 
    @DisplayName ("Transformar y sumar ")
    void trasnformaradd (){
        Ejercicio2 ejercicio2 = new Ejercicio2();
        Integer real = ejercicio2.trasnformarYSumar(CONJUNTO, s ->s*s );
        System.out.println(real);
        assertThat(real).isEqualTo(CONJUNTO.size());
    }





}
