

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando
 */
public class Alumno {
    
    //Atributos del alumno (coinciden con la tabla "alumnos" de la bd:
    private int id;
    private String nombre;
    private String apellido;

    //Constructor:
    public Alumno() {
    }
    //Constructor sobrecargado:
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;

    }
    
    //Constructor sobrecargado sin id:
    public Alumno(String nombre, String apellido ) {
        this.nombre = nombre;
        this.apellido = apellido;

    }    
    //Setters:
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //Getters:
    public int getId() {
        return id;
    }    
    public String getNombre() {
        return nombre;
    }    
    public String getApellido() {
        return apellido;
    }
    
    //Redefino el toString:
    @Override
    public String toString() {
        return "id: " + id + ", nombre: " + nombre + ", apellido: "
                + apellido+ "\n";
    }
}