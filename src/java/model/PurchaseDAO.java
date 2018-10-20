/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author apple
 */
public class PurchaseDAO {
    public String userPurchase(pur Pur){
    int new_points=Pur.getPoints();
    String Vname=Pur.getVname();
    String email= Pur.getEmail();
    
    Connection con;
 PreparedStatement ps,ps1=null;
 Statement statement= null;
 ResultSet resultSet = null;
 int i=0,j=0;
 
 try
 {
 con = DBconnect.createConnection();
    
  statement=con.createStatement();
     resultSet= statement.executeQuery("select * from customer where points>="+new_points+" and email='"+email+"'");
   
 if(resultSet.next()==true)
 {
     ps=con.prepareStatement("update customer set points= points - ? where email=?");
      ps.setInt(1,new_points);
     ps.setString(2,email);
     i= ps.executeUpdate();
     
      ps1=con.prepareStatement("insert into public.products_purchased values(?,?)");
      ps1.setString(1,email);
     ps1.setString(2,Vname);
     j=ps1.executeUpdate();
      
     if (i != 0 && j != 0)  //Just to ensure data has been inserted into the database
         return "Congratulations! Your product would be delivered soon";
 }
 else 
 {
     
     return "Insufficient balance!"; 
 }
 }
 catch(SQLException e)
 {
    e.getMessage();
 }
        
    
    return "Oops.. Something went wrong there..!";
    
    }
}
