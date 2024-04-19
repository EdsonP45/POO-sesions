package mx.utng.s11;

public class Herencia {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo (8.0,3.0, "Estilo 0");
        System.out.println("Informacion del triangulo  ");
        triangulo.mostrarESTILO();
        triangulo.mostrarDimension();
        System.out.println("El area para el triangulo  es: "+ triangulo.area());

        Triangulo triangulo1 = new Triangulo (6.0,1.0, "Estilo 1");
        System.out.println("Informacion del triangulo 1 ");
        triangulo1.mostrarESTILO();
        triangulo1.mostrarDimension();
        System.out.println("El area para el triangulo  es: "+ triangulo1.area());

        Triangulo triangulo2 = new Triangulo (5.0,9.0, "Estilo 2");
        System.out.println("Informacion del triangulo 2 ");
        triangulo2.mostrarESTILO();
        triangulo2.mostrarDimension();
        System.out.println("El area para el triangulo  es: "+ triangulo2.area());
    }
}
