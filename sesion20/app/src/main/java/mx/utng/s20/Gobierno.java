package mx.utng.s20;

public class Gobierno {
    private static Gobierno gobierno;
    private Gobierno (){
        System.out.println("Unica instancia de gobierno");
    }
    public static Gobierno getGobierno() {
        if (gobierno == null) {
            gobierno = new Gobierno();
            
        }
        return gobierno;
    }

    public void darApoyo(){
        System.out.println("Dando apoyo al ciudadano");
    }
}
