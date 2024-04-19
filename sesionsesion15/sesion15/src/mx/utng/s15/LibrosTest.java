package mx.utng.s15;

import java.util.PriorityQueue;
import java.util.Queue;

public class LibrosTest {
    public static void main(String[] args) {
        //Create Queue
        Queue <Libro>libros = new PriorityQueue<>();
        libros.add(new Libro("libro 1",3));
        libros.add(new Libro("libro 2",1));
        libros.add(new Libro("libro 3",2));
         System.out.println(libros);

        Libro libro = null;

        while ((libro = libros.poll())!=null);{
        System.out.println(libro.getTitulo());
          
        }

    }

    
    
}
