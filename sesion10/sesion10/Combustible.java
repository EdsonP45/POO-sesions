package mx.utng;

public class Combustible {

    private short litrosMaximos;
    private short litrosActuales;

public Combustible (){
    
}


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

   @Override
   public boolean equals(Object obj) {
       if (this==obj) return true;
       if (obj==null|| getClass()!= obj.getClass()) return false;
        
       Combustible that = (Combustibele)obj;

       if (litrosMaximos!=that.litrosMaximos) return false;
       
       return litrosActuales == that.litrosActuales;
   }
    
}
