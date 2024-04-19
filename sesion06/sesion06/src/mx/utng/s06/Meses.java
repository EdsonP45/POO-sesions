package mx.utng.s06;

import java.util.Scanner;

public class Meses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
          System.out.println("ingresa el mes: ");
          String mesActual = scanner.nextLine().toLowerCase();
          scanner.close();
        switch (mesActual) {
            case "enero":
            System.out.print(" febrero,");
            case "febreeo":
            System.out.print(" marzo,");
            case "marzo":
            System.out.print(" abril,");
            case "abril":
            System.out.print(" mayo,");
            case "mayo":
            System.out.print(" junio,");
            case "junio":
            System.out.print(" julio,");
            case "julio":
            System.out.print(" agosto,");
            case "agosto":
            System.out.print(" septiembre,");
            case "septiembre":
            System.out.print(" octubre,");
            case "octubre":
            System.out.print(" noviembre,");
            case "noviembre":
            System.out.println(" diciembre.");
                
                break;
        
            default:
                break;
        }
    }

}
