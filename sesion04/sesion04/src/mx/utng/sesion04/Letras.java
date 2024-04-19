package mx.utng.sesion04;

public class Letras {
    public static void main (String [] args){
        // crear un lector 
        Lector lector = new Lector ();
        lector.muestraMensaje("Teclea una palabra: ");
        String palabra = lector.leerEntrada();
        // crear un nuevo objeto ontador de caracteres
        ContadorCaracteres contador = new ContadorCaracteres();

        int numeroVocales = contador.cuentaVocales(palabra);
        System.out.println("Hay "+numeroVocales+" vocales");

        int numeroConsonantes = contador.cuentaConsonantes(palabra);
        System.out.println("Hay "+numeroConsonantes+" Consonantes");


        int numeroNumeros = contador.cuentaNumeros(palabra);
        System.out.println("Hay "+numeroNumeros+" Numeros");

        
    }
    }
