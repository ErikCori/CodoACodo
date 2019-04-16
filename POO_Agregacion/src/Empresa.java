
public class Empresa {
    private String razonSocial;
    private Empleado[] empleados;
    private int indiceEmpleados= 0;
    
    public Empresa(String razonSocial, int cantidadEmpleados){
        this.razonSocial = razonSocial;
        this.empleados = new Empleado[cantidadEmpleados];
    }
    //GETTERS
    public Empleado[] getEmpleados(){
        return this.empleados;
    }
    public boolean agregarEmpleado(Empleado empleado){
        boolean fueAgregado = false;
        if(this.indiceEmpleados<this.empleados.length){
            empleados[indiceEmpleados] = empleado;
            indiceEmpleados ++;
            fueAgregado = true;
        }
        return fueAgregado;
    }
    public void mostrarEmpleados(){
        int i=0;
        while(empleados[i]!= null) {
            System.out.println("Empleado "+(i+1)+" Legajo: "+empleados[i].getLegajo()+" Nombre: "+empleados[i].getNombre()+
                    " Apellido: "+empleados[i].getApellido()+" Dni: "+empleados[i].getDni()
                    );
            i++;
        }
    }
}
