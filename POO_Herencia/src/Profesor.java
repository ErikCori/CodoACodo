
public class Profesor {
    private String nombre;
    private String apellido;
    private int dni;
    private Materia materia;
    
    //Constructor 
    public Profesor(String nombre, String apellido, int dni, Materia materia){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.materia = materia;
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
    public Materia getMateria(){
        return this.materia;
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
    public void setMateria(Materia materia){
        this.materia = materia;
    }
    
    //Metodos
    public void trabajar(){
        System.out.println("El profesor enseño fisica todo el dia");
    }
}
