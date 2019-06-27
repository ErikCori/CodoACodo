/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Alumno {
    //Atributos del alumno 
    private int id;
    private String nombre;
    private String apellido;
    
    //constructor
    public Alumno(){
        
    }
    
    //Constructor sobrecargado:
    public Alumno(int id, String nombre, String apellido){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //getters 

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    //Redefino el toString
    @Override
    public String toString(){
        return "id: " + id +" , nombre: " + nombre + " , apellido: " + apellido;
    }
}
