package mx.utng.s17;

import java.io.File;

public class Directorio {
    public static void main(String[] args) {
        //Directorio raiz
        File directorioInicial = new File ("C:\\Users\\Lenovo\\Desktop\\Uni\\POO\\sesion17\\sesion17\\src\\temp");
         muestraContenidoDirectorio(directorioInicial);

    
    }
    public static void colocaEspacios (String directorioPadre, char simbolo){
        System.out.println("["+simbolo+"]");
        for (int i = 0; i < directorioPadre.length(); i++) {
            System.out.print("-");

            
        }

    }
     
    private static void muestraContenidoDirectorio (File directorio){
        colocaEspacios(directorio.getParent(), 'D');
        System.out.println(directorio.getName());
        File []  subdirectorios = directorio.listFiles();

        for (File archivo : subdirectorios) {
            if (archivo.isFile()){

            
            colocaEspacios(archivo.getParent(), 'A');
            System.out.println(archivo.getName());
            
        }else if(archivo.isDirectory()){
            muestraContenidoDirectorio(archivo);
        }
    }
        
} 
    
}
