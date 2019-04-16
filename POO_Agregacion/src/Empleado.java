
public class Empleado {
    private int legajo;
    private String nombre;
    private String apellido;
    private int dni;
    
    public Empleado(int legajo, String nombre, String apellido, int dni){
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    //GETTERS
    public int getLegajo(){
        return this.legajo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getDni(){
        return this.dni;
    }
    //SETTERS
    public void setLegajo(int legajo){
        this.legajo = legajo;
    }
    public void setNombe(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    @Override
    public String toString(){
        return "LEG:"+this.legajo+"--NOM:"+this.nombre+"--APE:"+this.apellido+"--DNI:"+this.dni;
    }
}
