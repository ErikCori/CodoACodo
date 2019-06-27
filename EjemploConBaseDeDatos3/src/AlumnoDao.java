
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public interface AlumnoDao {
    /*La interfaz AlumnoDao(Data Access Object
    
    */
    //Metodos Abstractos a Implementar
    //Devueve una lista con todos los Alumnos:
    public List<Alumno> obtenerAlumno();
    //Devuelve un Alumno:
    public Alumno obtenerAlumno(int id);
    //Agregar un alumno:
    public boolean agregarAlumno(Alumno alumno);
    //Modifica un Alumno:
    public boolean actualizarAlumno(Alumno alumno);
    //Borrar un Alumno segun id:
    public boolean borrarAlumno(int id);
}
