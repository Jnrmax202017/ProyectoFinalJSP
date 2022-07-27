package Utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDB {

    public static Connection getConexion() {
        Connection con = null;
        String cadena = "jdbc:mysql://localhost:3307/bd_inkardex?user=root&password=";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(cadena);
            System.out.println("Conexion Establecida");
        } catch (Exception e) {
            System.out.println("Error de conexion");
        }
        return con;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        getConexion();
    }

}
