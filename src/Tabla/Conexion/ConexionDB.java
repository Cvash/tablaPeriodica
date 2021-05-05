package Tabla.Conexion;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionDB {

    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String USER = "root";
    private static String PASSWORD = "toor";
    private static String URL = "jdbc:mysql://localhost:3306/tabla_periodica";

    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error en el DRIVER");
        }
    }

    public Connection conectar() {

        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la conexion" + e);
        }
        return con;
    }

}
