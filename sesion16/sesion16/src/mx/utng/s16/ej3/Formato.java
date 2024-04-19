package mx.utng.s16.ej3;

import java.time.LocalDate;

public class Formato {
    public static void main(String[] args) {
        final String NOMBRE = "Bobby";
        final int EDAD =  3; 
        final Float ESTATURA = 30.5f;
        final LocalDate FECHA_NACIMIENTO = LocalDate.of (2020, 8 , 2);
        System.out.println("El nombre de mi mascota es de: "+ NOMBRE+" Tiene una edad de: "+ EDAD+ " Su estatura es de: "+ ESTATURA+" Y nacio en el: "+ FECHA_NACIMIENTO);

        System.out.printf("El nombre de mi mascota es: |%8S| tiene una edad de: %05d su estatura es de: %.2f y nacio el dia: %4$te del mes %4$tB del %4$tY %n", NOMBRE, EDAD, ESTATURA, FECHA_NACIMIENTO);
    }
    
}
