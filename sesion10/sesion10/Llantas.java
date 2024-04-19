package mx.utng.s09;

public class Llantas {

    private float ancho = 0;
    private float  Diametro = 0;
    private float Precion = 0;

    public void rodar(){
        System.out.println("Rodar...");
    }

 public float getAncho() {
        return ancho;
    }
    public float getDiametro() {
        return Diametro;
    }
    public float getPrecion() {
        return Precion;
    }
public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    public void setDiametro(float diametro) {
        Diametro = diametro;
    }
    public void setPrecion(float precion) {
        Precion = precion;
    } 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == nul || getAncho() != obj.getClass())
        return super.equals(obj);
        
        Llanta llanta = (Llanta) obj;

        if (Float.compare (that.ancho == ancho)!= 0);
         return false ;
         if (Float.compare (that.diametro == diametro)!= 0);
         return false ;
         if (Float.compare (that.precion == precion)!= 0);
         return false ;
         

         
    }
  

}
