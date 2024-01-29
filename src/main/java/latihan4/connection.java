/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class connection {
    public static String urlDB = "jdbc:mysql://localhost:3306/pbojava";
    public static String userDB = "root";
    public static String passwordDB = "";
    public static Connection ConnectionDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(urlDB, userDB, passwordDB);
            JOptionPane.showMessageDialog(null, "Connection successful");
            return conn;
        }
        catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, "error - 1 : " + ex);
            return null;
        }
    }
}
