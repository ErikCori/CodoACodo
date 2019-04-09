
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona pers1 = new Persona();
        pers1.setNombre("Juan");
        //pers1.nombre = "Juan";
        pers1.setApellido("Perez");
        pers1.setDni(30735728);
        pers1.setCalle("Av. Riadavia");
        pers1.setAltura(3800);
        
        Persona pers2 = new Persona("Daniel", "Gomez", 20666888, "Av. Belgrano", 5000);
        pers2.setAltura(5010);
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        pers2.setNombre(teclado.nextLine());
        System.out.println("Ingrese su apellido: ");
        pers2.setApellido(teclado.nextLine());
        System.out.println("Ingrese su DNI: ");
        pers2.setDni(teclado.nextInt());
        teclado.nextLine();
        System.out.println("Ingrese la calle en donde vive: ");
        pers2.setCalle(teclado.nextLine());
        System.out.println("Ingrese la altura de la calle: ");
        pers2.setAltura(teclado.nextInt());
        
        String nombre ="Maria";
        String apellido = "Rodriguez";
        int dni = 17999000;
        String calle = "Moreno";
        int altura = 2500;
        
        Persona pers3 = new Persona(nombre, apellido, dni, calle, altura);
        
        System.out.println(nombre);
        System.out.println(pers3);
        System.out.println(pers1);
        
        pers1.toString();
    }
}
