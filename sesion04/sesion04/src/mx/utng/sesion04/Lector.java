package mx.utng.sesion04;

import java.util.Scanner;

public class Lector {
    private Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
    //crear un lector de valores desde la terminal 
    Scanner lector = new Scanner(System.in);
    System.out.println("Teclea tu nombre: ");
    // leer lo que el usuario mande como entrada 
    String nombre = lector.nextLine();

    System.out.println("Hola " + nombre );
    int edad = 19;
    boolean casado = false;
    System.out.printf("hola %s y tengo %d años y %s casado",
     nombre, edad,casado==true?"soy":"no soy");
}
// metodo muestera mensaje una cadena dada como parametro
public void muestraMensaje(String mensaje){
    System.out.println(mensaje);

}

// leer a partir del scanner 
public String leerEntrada(){
    return scanner.nextLine();
}


}
