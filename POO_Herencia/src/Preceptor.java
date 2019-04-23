public class Preceptor {
    private String nombre;
    private String apellido;
    private int dni;
    private int curso;
    
    //Constructor
    public Preceptor(String nombre, String apellido, int dni, int curso){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.curso = curso;
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
    public int getCurso(){
        return this.curso;
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
    public void setCurso(int curso){
        this.curso = curso;
    }
    //Metodos
    public void trabajar(){
        System.out.println("El preceptor cargo las notas del curso 419");
    }
}
