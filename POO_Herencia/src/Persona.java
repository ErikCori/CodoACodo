
public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    
    public Persona(String nombre, String apellido, int dni){
        this.nombre = nombre;
        this.apellido  = apellido;
        this.dni = dni;
    }
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getDni(){
        return this.dni;
    }
    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    //Metodos
    
    public String trabajar(){
        return "Esta persona esta trabajando";
    }
}
