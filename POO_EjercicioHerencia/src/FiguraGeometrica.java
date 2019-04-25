
public abstract class FiguraGeometrica {
    private String nombre;
    private int lado1;
    
    //Constructor
    public FiguraGeometrica(String nombre,int lado1){
        this.nombre= nombre;
        this.lado1 = lado1;
    }
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public int getLado1(){
        return this.lado1;
    }
   
    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setLado1(int lado1){
        this.lado1 = lado1;
    }
    //Metodos
    
    @Override
    public String toString(){
        return "Hola soy un ";
    }
    public abstract double obtenerArea();
    public abstract int obtenerPerimetro();
    
    public String mostrarFigura(){
        return "Soy una figura ";
    }
}
