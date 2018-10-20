/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DonateDAO {
    
public String userDonate(Donate donate){
        String Category = donate.getCategory();
        String Pname = donate.getPname();
        String email = donate.getEmail();
        String Pdesc = donate.getPdesc();
        String usage = donate.getUsage();
        int new_points=donate.getNew_points();
        
         Connection con;
 PreparedStatement ps=null;
 Statement statement= null;
 int i=0,j=0;
 

 try
 {
 con = DBconnect.createConnection();
    
  statement=con.createStatement();
    j = statement.executeUpdate("update customer set points= points + "+new_points+" where email='"+email+"'");
   
 
     ps=con.prepareStatement("insert into public.products_donated values(?,?,?,?,?)");
     
     ps.setString(1,email);
     ps.setString(2,Category);
     ps.setString(3,Pname);
     ps.setString(4,Pdesc);
     ps.setString(5,usage);
     
     i= ps.executeUpdate();
     if (i != 0 && j!=0)  //Just to ensure data has been inserted into the database
         return "SUCCESS";

 }
 catch(SQLException e)
 {
    e.getMessage();
 }
 
 return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
 }
     
}

