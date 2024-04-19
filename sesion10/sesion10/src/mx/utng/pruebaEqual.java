package mx.utng;

public class pruebaEqual {
    public static void main(String[] args) {
        Llanta llanta1  = new Llanta(205, 16, 35);
        Llanta llanta2  = new Llanta(205, 16, 35);
        Llanta llanta3  = new Llanta(205, 16, 35);
        Llanta llanta4  = new Llanta(205, 16, 35);

        Combustible  combustible = new Combustible((short) 40);

        Automobil  automobil new Automobil ("Ford", "Fiesta", 2015, 567);
        automobil.setCombustible (combustible);
        automobil.colocaLlantas(llanta1,llanta2,llanta3,llanta4);
        automobil.llenarTanque();

        Llanta llanta1  = new Llanta(205, 16, 135);
        Llanta llanta2  = new Llanta(205, 16, 135);
        Llanta llanta3  = new Llanta(205, 16, 135);
        Llanta llanta4  = new Llanta(205, 16, 135);

        Combustible combustible2 = new Combustible ((short)40);

        Automobil2  automobil new Automobil ("chevrolet", "chevy", 2015, 567);
        automobil.setCombustible (combustible);
        automobil.colocaLlantas(llanta1,llanta2,llanta3,llanta4);
        automobil.llenarTanque();

System.out.println(automobil.equals.Automobil2);




        
    }
    
}
