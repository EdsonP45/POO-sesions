package mx.utng.s290;

import java.util.List;
import java.util.function.Function;

public class Ejercicio1 {
    //private final StringToInteger parser = s -> Integer.parseInt(s);

    private final Function < String, Integer> parser = Integer :: parseInt;

    Integer sumar (String a, String b){
        return parser.apply(a)+ parser.apply(b);
    }

    public List<Integer> trasnformar(List<Integer> cONJUNTO, Object object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'trasnformar'");
    }


    
}

    
