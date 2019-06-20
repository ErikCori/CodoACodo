
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.DriverManager;

public class main {

    //Java con base de datos
    public static void main(String[] args) {
        Connection cnn = null;//coneccion
        ResultSet datos = null;
        ResultSetMetaData  metaData= null;
        PreparedStatement statement = null;
        
        //El usuario con el que nos conectamos al mySQL
        String user = "root";
        //El password del usuario
        String pass = "admin";
        //Apuntamos a la base de datos con la que queremos trabajar
        String url = "jdbc:mysql://127.0.0.1/world";
        String driver = "com.mysql.jdbc.Driver";
        //Variable para cargar las querys
        String consultaSql= "";
        try {
            Class.forName(driver);
            cnn = DriverManager.getConnection(url, user, pass);
            consultaSql = "SELECT country.name AS 'Pais',"
                    +"country.population AS 'Habitantes' "
                    +"FROM world.country ORDER BY country.name ASC;";
            statement = cnn.prepareStatement(consultaSql);
            
            datos = statement.executeQuery();
            metaData = datos.getMetaData();
            
            int cantRegistros = 0;
            
            //Opcion 1:
            System.out.println("***Pais -- Habitantes ***");
            
            while(datos.next()){
                System.out.println(datos.getString("Pais") + " -- "
                    + datos.getString("Habitantes"));
                cantRegistros ++;
            }
            System.out.println("");
            System.out.println("Cantidad de registros: "+cantRegistros);
            cnn.close();
        } catch (Exception e) {
            System.out.println("Hubo un error!!");
            System.out.println(e.getMessage());
        }
       
    }
    
}
