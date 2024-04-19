package mx.utng.s13;

public abstract class Animal {
    private String especie;
    private String Genero;
    private int edad;


    public String getEspecie() {
        return especie;
    }

    public String getGenero() {
        return Genero;
    }

    public int getEdad() {
        return edad;
    }

    public abstract void respirar();
    
}
