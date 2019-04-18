/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Motor {
    //Atributos
    private int cantCilindros;
    private int cilindrada;
    private Combustible tipoCombustible;
    
    public Motor(int cantCilindros, int cilindrada, Combustible tipoCombustible){
        this.cantCilindros = cantCilindros;
        this.cilindrada = cilindrada;
        this.tipoCombustible = tipoCombustible;
    }
    //Getters
    
    public int getCantCilindros(){
        return this.cantCilindros;
    }
    public int getCilindrada(){
        return this.cilindrada;
    }
    public Combustible getTipoCombustible(){
        return this.tipoCombustible;
    }
    //Setters
    
    public void setCantCilindros(int cantCilindros){
        this.cantCilindros = cantCilindros;
    }
    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }
    public void setTipoCombustible(Combustible tipoCombustible){
        this.tipoCombustible = tipoCombustible;
    }
    
    @Override
    public String toString(){
        return "Cilindrada: "+this.cilindrada+", Tipo de omustible: "+this.tipoCombustible;
    }
}
