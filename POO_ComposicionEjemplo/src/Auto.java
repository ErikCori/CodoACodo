/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Auto {
    //Atributos
    private String marca;
    private Motor motor;
    
    public Auto(String marca, int cantCilindros, int cilindrada, Combustible tipoCombustible){
        this.marca = marca;
        this.motor = new Motor(cantCilindros, cilindrada, tipoCombustible);
    }
    //Setters
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setCantCilindros(int cantCilindros){
        this.motor.setCantCilindros(cantCilindros);
    }
    public void setCilindrada(int cilindrada){
        this.motor.setCilindrada(cilindrada);
    }
    public void setTipoCombustible(Combustible tipoCombustible){
        this.motor.setTipoCombustible(tipoCombustible);
    }
    //Getters
    
    public String getMarca(){
        return this.marca;
    }
    public int getCantCilindros(){
        return this.motor.getCantCilindros();
    }
    public int getCilindrada(){
        return this.motor.getCilindrada();
    }
    public Combustible getTipoCombustible(){
        return this.motor.getTipoCombustible();
    }
    
    @Override
    public String toString(){
        return "Marca: "+this.marca+" - Cant. Cilindros: "+
                this.getCantCilindros()+" - Cilindrada: "+
                this.getCilindrada()+" - Tipo de Combustible: "+
                this.getTipoCombustible();
    }
}
