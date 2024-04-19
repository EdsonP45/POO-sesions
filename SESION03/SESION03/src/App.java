import mx.utng.sesion03.Autor;
import mx.utng.sesion03.Libro;

public class App {
    public static void main(String[] args) throws Exception {
        Autor autor = new Autor();
        autor.setNombre("Edson");
        autor.setApellido("Puebla");
        autor.setEdad(19);

        Libro libro = new Libro();
        libro.setAutor(autor);
        libro.setTitulo("Hearstopper");
        libro.setAnio(2023);
        libro.setNumeroPginas(220);
        
        System.out.println("Libro: "+libro.getTitulo());
        System.out.println("Autor: "+libro.getAutor() .getNombre()+" "+libro.getAutor() .getApellido());

    }
}
