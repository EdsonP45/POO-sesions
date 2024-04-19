package mx.utng;

public class primitivos {
public static void main (String[]args){

    byte valorByte = 1;
    short valorShort = 1;
    int valorInt = 1;
    long valorLong = 1; 


    float valorFloat = 1.5f;
    double valorDouble = 1.5;


    System.out.println("este es un byte: " + valorByte );
    System.out.println("este es un short: " + valorShort );
    System.out.println("este es un Int: " + valorInt );
    System.out.println("este es un Long: " + valorLong );
    System.out.println("este es un Float: "+ valorFloat );
    System.out.println("este es un Double: " + valorDouble );

    boolean valorBoolean = true;
    char valorChar = 'B';

    System.out.println("este es un Boolean: " + valorBoolean );
    System.out.println("este es un Char: " + valorChar );

    int numInt1 = (int)valorFloat;
    System.out.println("Cast int : " + valorInt );

    float numeroFloat = numInt1;
    char numChar = 'M';
    int numeroInt2 = (int)numChar;
    System.out.println(numInt2);

    String cadena1 = "57";
    int numInt3 = Integer.parseInt(cadena1);
    System.out.println(numInt3);
    
    numInt3++;
    System.out.println(numInt3);
    
    char valorChar2 = (char) numInt2; 

    System.out.println(valorChar2);
}
}
