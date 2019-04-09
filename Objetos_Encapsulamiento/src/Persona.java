/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Persona {
    //Mala practica
    //String nombre;
    //int dni;
    //Encapsulando los atributos
    private String nombre;
    private String apellido;
    private String calle;
    private int altura;
    private int dni;
    
    public Persona(){
    }
    public Persona(String nombre, String apellido, int dni, String calle, int altura){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.calle = calle;
        this.altura = altura;
    }
    
    //Creando setters y getters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setCalle(String calle){
        this.calle = calle;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    
    //getters
    
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getCalle(){
        return this.calle;
    }
    public int getAltura(){
        return this.altura;
    }
    public int getDni(){
        return this.dni;
    }
    @Override
    public String toString(){
        return this.nombre +"--"+this.apellido+"(es una persona)";
    }
}
