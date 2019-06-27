
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Conexion {
    
    //Atributo para gestionar la conexion a la base de datos
    private Connection cnn;
    //Constructor
    public Conexion(){
        
    }
    //Metodos par abrir la conexion:
    public void abrir(){
        //Usuario y contraseña para conectarme al servidor ed base de datos:
        String user = "root";
        String pass = "root";
        //url de conexion para llegar a la base de datos "escuela"
        String url = "jdbc:mysql://127.0.0.1:3306/"
                +"escuela?autoReconnect=true&useSSL=false&serverTimezone=GMT";
        //Driver de conexion 
        String driver = "com.mysql.cj.jdbc.Driver";
        try {
            //Cargo el driver de conexion:
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            System.out.println("NO SE ENCONTRO LA CLASE: "+ ex.getMessage());
            System.out.println("CERRANDO EL SISTEMA.");
            System.exit(0);
        }
        
        try {
            //Inicializo el objeto Conecction:
            cnn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            System.out.println("NO SE PUDO REALIZAR LA CONEXION: "+ ex.getMessage());
            System.out.println("CERRANDO EL SISTEMA.");
            System.exit(0);
        }
    }
        
        //Metodo para cerrar la conexion:
        public void cerrar() throws SQLException {
            cnn.close();
        }
        
        //Getter:
        public Connection getCnn(){
            return cnn;
        }
}
