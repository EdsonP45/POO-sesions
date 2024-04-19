package mx.utng.s09;

import mx.automobil;

public class Compocision {
    public static void main(String[] args) {
        Llantas llanta1 = new Llantas();
        llanta1.setAncho(205);
        llanta1.setDiametro(16);
        llanta1.setPrecion(35);

        Llantas llant2 = new Llantas();
        llanta1.setAncho(205);
        llanta1.setDiametro(16);
        llanta1.setPrecion(35);

        Llantas llanta3 = new Llantas();
        llanta1.setAncho(205);
        llanta1.setDiametro(16);
        llanta1.setPrecion(35);

        Llantas llanta4 = new Llantas();
        llanta1.setAncho(205);
        llanta1.setDiametro(16);
        llanta1.setPrecion(35);

        Combustible combustible  = new Combustible();
        combustible.setLitrosActuales((short)0);
        combustible.setLitrosMaximos((short)40);

        automobil auto =  new Automobil ("For", "Nissan");
        auto.setCombustible(combustible);
        auto.colocaLlantas(llant2, llant2, llanta3, llanta4);
        auto.llenarTanque();
        
    }

        
    }

   
