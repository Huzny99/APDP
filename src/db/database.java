/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class database {
    private static final String jdbc_url ="jdbc:mysql://localhost:3306/student";
    private static final String username = "root";
    private static final String password = "";
    
    public static Connection getconnection () {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(jdbc_url,username,password);
         
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
            
        }
        
        
    }
           
}
