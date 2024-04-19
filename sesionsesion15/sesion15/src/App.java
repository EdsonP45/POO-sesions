import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {


    public static void main(String[] args) throws Exception {
        List <String> materias  = new ArrayList<>();
        materias.add("POO");
        Collections.addAll(materias, "FSC", "BD", "MMDS","RED");
        System.out.println(materias);
        for (String materia : materias) {
            System.out.println(materia);
        }
        Collections.reverse(materias);
        System.out.println(materias);
        System.out.println("Mas pequeña: "+ Collections.min(materias));
        System.out.println("Mas grande: "+ Collections.max(materias));
        Collections.sort(materias);
        System.out.println(materias);
        System.out.println("Metodologia y Modelado se encuentra en " + (Collections.binarySearch(materias, "MMDS")));
        


        
    }
}
