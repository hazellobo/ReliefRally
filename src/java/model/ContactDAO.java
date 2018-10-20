/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class ContactDAO {
     public String contactUs(ContactUs contact)
 {  
     
     String fname = contact.getFname();
     String lname = contact.getLname();
     String email = contact.getEmail();
     String country= contact.getCountry();
     String subject=contact.getSubject();
    
 Connection con=null;
 PreparedStatement ps=null;
 
 
 try
 {
 con = DBconnect.createConnection();
      ps=con.prepareStatement("insert into public.contact values(?,?,?,?,?)");     
     ps.setString(1, fname);
     ps.setString(2, lname);
     ps.setString(3, email);
     ps.setString(4, country);
     ps.setString(5, subject);
     int i= ps.executeUpdate();
     if (i != 0)  //Just to ensure data has been inserted into the database
         return "SUCCESS";
 }
 catch(SQLException e)
 {
    e.getMessage();
 }
 
 return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
 }
    
}


