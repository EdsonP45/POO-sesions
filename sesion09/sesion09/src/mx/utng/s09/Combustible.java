package mx.utng.s09;

public class Combustible {

    private short litrosMaximos;
    private short litrosActuales;

    public void usar (){
        litrosActuales--;
        System.out.println("Quedan "+litrosActuales+  "litos");
       
    }


    public void setLitrosMaximos(short litrosMaximos) {
        this.litrosMaximos = litrosMaximos;
    }

    public void setLitrosActuales(short litrosActuales) {
        this.litrosActuales = litrosActuales;
    }

    public short getLitrosMaximos() {
        return litrosMaximos;
    }

    public short getLitrosActuales() {
        return litrosActuales;
    }

   
    
}
