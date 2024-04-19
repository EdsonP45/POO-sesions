package mx.utng.s23.Factory;

import java.util.Scanner;

public class LoggerTest {
    public static void main(String[] args) {
        //declarar un objeto LoggerFactory
        LoggerFactory factory = new LoggerFactory();

        Scanner scanner = new Scanner(System.in);
        System.out.println("teclea el tipo de logger");
        int type = scanner.nextInt();
        //Crear el Logger elegido por el usuario 

        Logger logger = factory.getLogger(type);
        logger.log("Registro de eventos del sistema");
        
    }
    
}
