public class Pentagono extends FiguraGeometrica{
    public Pentagono(String nombre,int lado1){
        super(nombre,lado1);
    }
    
    @Override
    public String toString(){
        return super.toString()+"pentagono";
    }
    @Override
    public int obtenerPerimetro(){
        return getLado1() *5;
    }
    @Override
    public double obtenerArea(){
        return (5*getLado1()*getLado1())/1.45;
    }
    @Override
    public String mostrarFigura(){
        return super.mostrarFigura()+"pentagono";
    }
}
