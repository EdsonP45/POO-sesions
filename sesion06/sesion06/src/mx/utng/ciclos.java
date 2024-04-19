package mx.utng;

import java.util.Scanner;

public class ciclos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Que table deas que te muestre: ");
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= 10; i++) {
            //System.out.println("5X"+i+"="+5*i);
            System.out.printf("%dx%d=%d\n",n,i,n*i);
            
        }

        short[] valores = {1,2,3,4,5,6,7,8,9};
        //for (int i = 0; i < valores.length; i++) {
            //System.out.printf("%dx%d=%d\n",n,valores[i],n*valores[i]);

    }

     for (short s : valores) {
     //System.out.print(s+",");
}
     System.out.println("");

        //while
        short i = 0;
        while (++i <=10){
            System.out.println(i);
        }

        //Do while
        i = 1;
        do {

        }while (i++<10);
    }
    
}
