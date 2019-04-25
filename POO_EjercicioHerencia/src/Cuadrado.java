public class Cuadrado extends FiguraGeometrica {
    public Cuadrado(int lado1){
        super("Cuadrado",lado1);
    }
    
    //Metodos
    @Override
    public String toString(){
        return super.toString()+"cuadrado";
    }
    @Override
    public int obtenerPerimetro(){
        return getLado1() * 4;
    }
    @Override
    public double obtenerArea(){
        return getLado1() * getLado1();
    }
    @Override
    public String mostrarFigura(){
        return super.mostrarFigura()+"cuadrado";
    }
}
