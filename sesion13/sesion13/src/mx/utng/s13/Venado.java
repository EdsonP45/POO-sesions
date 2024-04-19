package mx.utng.s13;

public class Venado extends Animal implements  Hervivoro {
    private boolean tieneCuernos;

    public void setTieneCuernos(boolean tieneCuernos) {
        this.tieneCuernos = tieneCuernos;
    }

    public boolean isTieneCuernos() {
        return tieneCuernos;
    }

    @Override
    public void respirar(){
       System.out.println("Respiro como venado");
    }  
    
    @Override
    public void comer(){
        System.out.println("comiendo como venado");

    }
    
}
