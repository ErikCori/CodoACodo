
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Empleado emp1= new Empleado(100,"Lucas","Perez",35000999);
        Empleado emp2= new Empleado(101,"Ana","Suarez",29000444);
        Empleado emp3= new Empleado(102,"Carlos","Gomez",28444333);
        Empleado emp4= new Empleado(103,"Gabriela","Rodriguez",33222000);
        
        //Nombre de empresa y cantidad de empleados:
        Empresa panaderia= new Empresa("La bola de fraile", 3);
        
        //Agrego un empleado a la empresa:
        contratar(emp1,panaderia);
        contratar(emp2,panaderia);
        contratar(emp3,panaderia);
        contratar(emp4,panaderia);
        
     
        Empresa pizzeria= new Empresa("La bufalinda", 3);
        
        //contratar(emp3, pizzeria);
        //contratar(emp4, pizzeria);
               
        panaderia.mostrarEmpleados();        
        pizzeria.mostrarEmpleados();      
        */
        Empresa parrilla = new Empresa("El bondiolazo", 3);
        Empresa pizzeria = new Empresa("La doble de muzza", 2);
        
        pizzeria.agregarEmpleado(10, "Juan", "Gomez", 34666000);
        pizzeria.agregarEmpleado(23, "Marcos", "Marinez", 12567904);
        pizzeria.agregarEmpleado(34, "Mario", "Alvarez", 35678493);
        parrilla.agregarEmpleado(12,"Maria","Rodriguez", 23456789);
        
        
        pizzeria.mostrarEmpleados();
        parrilla.mostrarEmpleados();
   }
    
   public static void contratar(int legajo, String nombre, String apellido, int dni, Empresa unaEmpresa){
       if ( unaEmpresa.agregarEmpleado(legajo, nombre, apellido, dni)){
            System.out.println("EMPLEADO AGREGADO!");
        }else{
            System.out.println("NO HAY LUGAR!");
        }
   }
   
}
