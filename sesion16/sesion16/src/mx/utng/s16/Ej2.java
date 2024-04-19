package mx.utng.s16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ej2 {
    public static void main(String[] args)throws IOException {
        FileWriter fileWriter = new FileWriter(System.getProperty("user.home")+"/archivo.txt");
       //System.out.println(fileWriter);
       BufferedWriter bw = new BufferedWriter(fileWriter);
       bw.write("Esta linea se escribira en el archivo");
       bw.newLine();
       bw.write("esta es la sgunda linea");
       bw.newLine();
       bw.write("Esta es la tercera linea");
       bw.newLine();
       bw.write("Feliz 14 de Febrero");
       bw.close();

       BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.home")+"/archivo.txt"));

       //Leer todo el archivo

       String linea ;
       while ((linea = br.readLine())!=null){ 
        System.out.println(linea);
       }

    }
}
