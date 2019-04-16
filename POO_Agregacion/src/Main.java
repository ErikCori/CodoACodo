
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado emp1 = new Empleado(1,"Lucas", "Perez", 35000999);
        Empleado emp2 = new Empleado(200,"Maria", "Gomez", 33444666);
        
        Empresa panaderia = new Empresa("La bola de fraile", 3);
        Empresa pizzeria = new Empresa("La bufalinda", 28555444);
        
        if(panaderia.agregarEmpleado(emp1)){
            System.out.println("Empleado agregado");
        }else{
            System.out.println("NO HAY PUESTOS DISPONIBLES");
        }
        contratar(emp2, panaderia);
        contratar(emp2, pizzeria);
        pizzeria.mostrarEmpleados();
        panaderia.mostrarEmpleados();
    }
    public static void contratar(Empleado unEmpleado, Empresa unaEmpresa){
        if(unaEmpresa.agregarEmpleado(unEmpleado)){
            System.out.println("EMPLEADO AGREGADO");
        }else{
            System.out.println("NO HAY PUESTOS DISPONIBLES");
        }
    }
}
