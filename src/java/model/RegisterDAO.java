package model;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegisterDAO {
   
    public String registerUser(Register register)
 {  
     
     String fname = register.getFname();
     String lname = register.getLname();
    String email = register.getEmail();
    String password= register.getPassword();
    String phone=register.getPhone();
    String address=register.getAddress();
    String state=register.getState();
    String city= register.getCity();
   
 Connection con;
 PreparedStatement ps=null;
 Statement statement= null;
 ResultSet resultSet = null;
 
 try
 {
 con = DBconnect.createConnection();
 statement=con.createStatement();
 resultSet = statement.executeQuery("select email from public.customer where email='"+email+"' or phone='"+phone+"'");
    
 if(resultSet.next()==false)
 {
     ps=con.prepareStatement("insert into customer values('"+fname+"' ,'"+lname+"','"+email+"','"+phone+"','"+password+"','"+address+"','"+city+"','"+state+"')");
     int i= ps.executeUpdate();
     if (i != 0)  //Just to ensure data has been inserted into the database
         return "SUCCESS";
 }
 else 
 {
     
     return "You are already registered. Sign-in!"; 
 }
     

 }
 catch(SQLException e)
 {
    e.getMessage();
 }
 
 return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
 }

  /* 
    public String resetPass(Register r) {
        String email=r.getEmail();
        String newPass=r.getPassword();
        Connection con;
        PreparedStatement ps=null;
      
        try {
            con = DBconnect.createConnection();
             ps=con.prepareStatement("update customer set password="+newPass+" where email="+email+"");
            int i= ps.executeUpdate();
            if (i != 0)  //Just to ensure data has been inserted into the database
             return "SUCCESS";
            
             else{
                  return "OldPass doesnt match" ;      
                }
        }
            catch (SQLException ex) {
            Logger.getLogger(RegisterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    return "Oops.. Something went wrong there..!";
    }
*/
    
}



   
    
    
    
    
    
    
    
