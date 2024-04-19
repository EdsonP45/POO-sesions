package mx.utng.s27.reto;

public class RetoTest {
    public static void main(String[] args) {
        Hilo1 h1 = Hilo1 ();
        Hilo2 h2 = Hilo2 ();
        Hilo1 h3 = Hilo1 ();
        h2.setDaemon (true);
        h1.setDaemon(true);

        h1.start();
        h2.start();
        h3.start();

        
    }
    
}
