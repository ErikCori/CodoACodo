
public class Director extends Persona{
    private Turno turno;
    
    //Constructor
    public Director(String nombre, String apellido, int dni, Turno turno){
        super(nombre, apellido, dni);//con el super se lo pasamos a la clase padre
        this.turno = turno;          //en este caso Persona es una superclase
    }
    
    //Getters

    public Turno getTurno(){
        return this.turno;
    }
    //Setters
    
    public void setTurno(Turno turno){
        this.turno = turno;
    }
    //Metodos
    @Override
    public String trabajar(){
        return super.trabajar()+"(como director) en el turno "+this.turno;
    }
}
