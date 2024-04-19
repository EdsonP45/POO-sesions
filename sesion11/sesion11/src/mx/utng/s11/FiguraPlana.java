package mx.utng.s11;

public class FiguraPlana {
    private final double BASE;
    private final double AlTURA;

    public FiguraPlana(double base, double altura){
    this.BASE=base;
    this.AlTURA=altura;

}


    public double getBASE (){
        return BASE;
    }
    
    public double getALTURA (){
        return AlTURA;
    }
    public void mostrarDimension (){
        System.out.println("La base y la altura son : " + BASE+ "  y  " + AlTURA);
    }
     


    
}
