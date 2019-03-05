package Conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Conexion_BD {
    static Connection con = null;
    static String url = "jdbc:mysql://localhost/jefe_db";
    static String user = "root";
    static String pass = "";
public static Connection Conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Conexión exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
}
}