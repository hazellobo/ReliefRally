
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBconnect {

    public static Connection createConnection()
 {
 Connection con = null;
 try 
 {
 try 
 {
    Class.forName("org.postgresql.Driver"); //loading MySQL drivers. This differs for database servers 
 } 
 catch (ClassNotFoundException e)
 {
     e.getMessage();
 }
 
 con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Donation","postgres","1234"); //attempting to connect to MySQL database
 System.out.println("Printing connection object "+con);
 } 
 catch (SQLException e) 
 {
    Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, e);
 }
 
 return con; 
 }
}