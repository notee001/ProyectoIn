package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author Usuario
 */
public class ConexionDB {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USER = "Proyecto";
    private static final String PASWORD = "Proyecto";
    
    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASWORD);
    }
}
