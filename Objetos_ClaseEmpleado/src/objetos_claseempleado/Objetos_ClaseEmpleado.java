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
public class Objetos_ClaseEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado emple1 = new Empleado("Juan", Sexo.MASCULINO, 30000);
        int cantidad = 3;
        if(emple1.trabajar(cantidad)){
            System.out.println("Trabajo: "+cantidad);
        }else{
            System.out.println("No las trabajo!!");
        }
        System.out.println(emple1.toString());
    }
    
}
