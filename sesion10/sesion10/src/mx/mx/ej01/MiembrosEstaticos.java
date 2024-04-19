package mx.mx.ej01;

public class MiembrosEstaticos {
    
    
        public static void main(String[] args) {
    
            Contador cont1 = new Contador ();
            Contador cont2 = new Contador ();
            Contador cont3 = new Contador ();
            Contador cont4 = new Contador ();

            cont1.setContadorInstancia((short)2);
            cont2.setContadorInstancia((short)2);
            cont3.setContadorInstancia((short)2);
            cont4.setContadorInstancia((short)2);
            
            System.out.println("Contador 1, contadorClase: "+ cont1.getContadorClase());
            System.out.println("Contador 1, contadorIntancia: "+ cont1.getContadorInstancia());

            System.out.println("Contador 2, contadorClase: "+ cont2.getContadorClase());
            System.out.println("Contador 2, contadorIntancia: "+ cont2.getContadorInstancia());

            System.out.println("Contador 3, contadorClase: "+ cont3.getContadorClase());
            System.out.println("Contador 3, contadorIntancia: "+ cont3.getContadorInstancia());

            System.out.println("Contador 4, contadorClase: "+ cont4.getContadorClase());
            System.out.println("Contador 4, contadorIntancia: "+ cont4.getContadorInstancia());
            
    
    }
    
    }

