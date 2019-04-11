/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos_claseempleado;

/**
 *
 * @author alumno
 */
public class Empleado {
    private String nombre;
    private Sexo sexo;
    private double sueldoBruto;
    private double sueldoNeto;
    private int horasTrabajadas;
    
    public Empleado(){
    }
    
    public Empleado(String nombre, Sexo sexo, int sueldoBruto){
        this.nombre = nombre;
        this.sexo = sexo;
        this.sueldoBruto = sueldoBruto;
        this.sueldoNeto = calcularSueldoNeto();
        this.horasTrabajadas = 0;
    } 
    
    //GETTERS
    
    public String getNombre(){
        return this.nombre;
    }
    public Sexo getSexo(){
        return this.sexo;
    }
    public double getSueldoBruto(){
        return this.sueldoBruto;
    }
    public double getSueldoNeto(){
        return this.sueldoNeto;
    }
    public int getHorasTrabajadas(){
        return this.horasTrabajadas;
    }
    
    //SETTERS
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setSexo(Sexo sexo){
        this.sexo = sexo;
    }
    public void setSueldoBruto(double sueldoBruto){
        this.sueldoBruto = sueldoBruto;
        this.sueldoNeto = calcularSueldoNeto();
    }
    
    private void setHorasTrabajadas(int horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }
    /*@Override
    public String toString(){
        return this.nombre+", empleado de sexo "+this.sexo+", sueldo NETO "+this.sueldoNeto+", lleva trabajadas "+this.horasTrabajadas+" horas";
    }*/
    
    @Override
    public String toString(){
        String mensaje = this.nombre+", empleado de sexo "+this.sexo+" ";
        return this.nombre+", empleado de sexo "+this.sexo+", sueldo NETO "+calcularSueldoNeto()+", FINALIZO su jornada laboral";
    }
    private double calcularSueldoNeto(){
        return this.sueldoBruto * 0.83;
    }
    
    public boolean trabajar(int cantHoras){
        boolean pudoTrabajar = false;
        if(this.horasTrabajadas + cantHoras <=8){
            this.horasTrabajadas = this.horasTrabajadas+cantHoras;
            pudoTrabajar = true;
        }
        return pudoTrabajar;
    }
}
