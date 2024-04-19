package mx;

import mx.utng.s09.Combustible;
import mx.utng.s09.Llantas;

public class automobil {
    private  String marca;
    private  String modelo;
    private  int anioFabricacion;
    private  int kilometraje;
    private Llantas [] llantas = new Llantas[4];
    private Combustible combustible = new Combustible();


    public automobil(String marca, String modelo, int anioFabricacion, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
    }

    @Override
    public int hashCode() {
       int hash = 0;
       hash+=marca.hashCode();
       hash+=modelo.hashCode();
       hash+=anioFabricacion;
       hash+=kilometraje;

        return hash;
    }

     public void setCombustible(Combustible combustible){
        this.combustible = combustible;

     }    

     public void colocaLlantas (Llantas delanteraIzquierda, Llantas  delanteraDerecha, Llantas traseraIzquierda, Llantas traseraDerecha ){
        llantas[0]=delanteraIzquierda;
        llantas[1]=delanteraDerecha;
        llantas[2]=traseraIzquierda;
        llantas[3]=traseraDerecha;
     }

     public void llenarTanque()

     public void avanza (){
        combustible.setLitrosActuales(
            combustible.getLitrosMaximos());
     }

     public void avanzar (){
        if (combustible.getLitrosActuales()>0);
        for (Llantas llanta : llantas){
            llanta.rodar();
            
        }combustible.usar();
        
        }else{
            System.out.println("No hay combustible");
        }
     }



