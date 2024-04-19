package mx.utng;

import java.util.Scanner;

public class Swtchit {
    public static void main(String[] args) {
        // defino objeto scanner 

        Scanner scanner = new Scanner(System.in);
        System.out.println("teclea tu calificacion: ");
        int calif = scanner.nextInt();
        

        switch (calif) {
            case 10:
                 System.out.println("Exelente");
                
                break;
            case 9:
            case 8:
                 System.out.println("Muy bien");
                 break;
            case 7:
                 System.out.println("Bien hecho");
                 break;
            case 6:
                 System.out.println("Pansaste pa");
                 break;

            default:
                  System.out.println("Estas dado de baja perro");
                break;
        }
        
    }
    
}
