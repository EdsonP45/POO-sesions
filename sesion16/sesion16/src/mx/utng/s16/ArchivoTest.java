package mx.utng.s16;

import java.io.File;
import java.io.IOException;

public class ArchivoTest {
    public static void main(String[] args)throws IOException{
        File archivo = new File("C:/temp/cursos/cursos.txt");
        //Consultar el nombre, ruta, directorio, padre, si esta oculto
        //si existe
        System.out.println("Nombre del archivo: "+archivo.getName());
        System.out.println("ruta: "+archivo.getPath());
        System.out.println("Ruta absoluta: "+archivo.getAbsolutePath());
        System.out.println("Directorio padre: "+archivo.getParent());
        System.out.println("Existe?: "+(archivo.exists()?"si":"NO"));
        System.out.println("Es oculto?: "+(archivo.isHidden()?"si":"NO"));

        //Tienes permisos de lectura?
        System.out.printf("%s puedeescribir%n", (archivo.canWrite()?"si":"NO"));
        System.out.printf("%s Puede leer %n", (archivo.canRead()?"si":"NO"));
        System.out.printf("%s puede ejecutar %n",(archivo.canExecute()?"si":"NO"));   
        System.out.printf("%s pude directorio %n",(archivo.isDirectory()?"si":"NO"));   
        System.out.printf("%s bytes de tamaño %n",(archivo.length()));
       
    }
    
}
