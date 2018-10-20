package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpSession;

 public class LoginDAO {
 public String authenticateUser(Login login) throws SQLException
 {
 
    String email = login.getEmail(); //Keeping user entered values in temporary variables.
    String password = login.getPassword();
 
 Connection con = null;
 Statement statement= null;
 ResultSet resultSet = null;
 
String emailDB = "";
String fnameDB= "";

try
 {
 con = DBconnect.createConnection(); //establishing connection
 statement = con.createStatement(); //Statement is used to write queries. Read more about it.
 resultSet = statement.executeQuery("select * from customer where password='"+password+"'"); //Here table name is customer and email,fname are columns. fetching all the records and storing in a resultSet.
 
while(resultSet.next()) // Until next row is present otherwise it return false
 {
  emailDB = resultSet.getString("email");
  fnameDB= resultSet.getString("fname");
  if(email.equals(emailDB))
   {
      
      return fnameDB;
   }
  
 }
 }
 catch(SQLException e)
    {
        e.getMessage();
    }
    return "Invalid user login"; // Just returning appropriate message otherwise
 }
 }
