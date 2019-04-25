public class TrianguloEscaleno  extends FiguraGeometrica{
    private int lado2;
    private int lado3;
    public TrianguloEscaleno(int lado1, int lado2, int lado3){
        super("Triangulo Escaleno",lado1);
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    //Getters
    public int getLado2(){
        return this.lado2;
    }
    public int getLado3(){
        return this.lado3;
    }
    //Setters
    public void setLado2(int lado2){
        this.lado2 = lado2;
    }
    public void setLado3(int lado3){
        this.lado3 = lado3;
    }
    //Metodos
    @Override
    public String toString(){
        return super.toString()+"triangulo";
    }
    @Override 
    public int obtenerPerimetro(){
        return this.getLado1()+this.getLado2()+this.getLado3();
    }
    @Override 
    public double obtenerArea(){
        double semi =obtenerPerimetro()/2;
        double aux = semi*(semi-getLado1())*(semi-getLado2())*(semi-getLado3()); 
        return Math.sqrt(aux);
    }
    @Override
    public String mostrarFigura(){
        return super.mostrarFigura()+"triangulo escaleno";
    }
}
