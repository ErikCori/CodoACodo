public class Rectangulo extends FiguraGeometrica {
    private int lado2;
    
    public Rectangulo(int lado1, int lado2){
        super("Rectangulo",lado1);
        this.lado2 = lado2;
    }
    //Getters
    public int getLado2(){
        return this.lado2;
    }
    
    //Setters
    public void setLado2(int lado2){
        this.lado2 = lado2;
    }
    
    //Metodos
    @Override
    public String toString(){
        return super.toString()+"rectangulo";
    }
    @Override
    public double obtenerArea(){
        return getLado1() *getLado2();
    }
    @Override
    public int obtenerPerimetro(){
        return (getLado1()*2)+(this.lado2 *2);
    }
    @Override
    public String mostrarFigura(){
        return super.toString()+" rectangulo";
    }
}
