
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MasterDao extends DBconnect {
    Connection con=null;
    PreparedStatement ps;
    ResultSet rs= null;
        ResultSet rs1=null;
      PreparedStatement ps1;
      PreparedStatement ps2;
      Statement statement= null;
      
  public void forgot(Register r){
        String email= r.getEmail();
        String password=r.getPassword();
        try{
        con=createConnection();
        statement = con.createStatement();
        rs = statement.executeQuery("select email from public.customer where email='"+email+"' ");
        if(rs.next()==true)
        {
          ps=con.prepareStatement("Update public.customer set password='"+password+"' where email='"+email+"'");
         int i= ps.executeUpdate();
          
          if (i != 0)  //Just to ensure data has been inserted into the database
         System.out.println("updated");
       }
        
        
        
    }   catch (SQLException ex) {
            Logger.getLogger(MasterDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
  }
    public List getAllDonaters(){
        ArrayList<Donate> Donate = new ArrayList<>();
        try {
            
            String sql="select * from products_donated";
            con=createConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){
                Donate d=new Donate();
                d.setEmail(rs.getString(1));
                d.setCategory(rs.getString(2));
                d.setPname(rs.getString(3));
                d.setPdesc(rs.getString(4));
                d.setUsage(rs.getString(5));
                Donate.add(d);
           
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MasterDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return Donate;
        
    }
    public List getAllPurchasers(){
        ArrayList<pur> pur = new ArrayList<>();
        try {
            
            String sql="select * from products_purchased";
            con=createConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){
                pur Pur=new pur();
                Pur.setEmail(rs.getString(1));
               
                Pur.setVname(rs.getString(2));
               pur.add(Pur);
               
           
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MasterDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return pur;
        
    }

    public List getAllCustomers(){
        ArrayList<Register> Register = new ArrayList<>();
        try {
            
            String sql="select * from customer";
            con=createConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){
                
               Register r;
                r = new Register();
                r.setFname(rs.getString(1));
                r.setLname(rs.getString(2));
                r.setEmail(rs.getString(3));
                r.setPhone(rs.getString(4));
                r.setPassword(rs.getString(5));
                r.setAddress(rs.getString(6));
                r.setCity(rs.getString(7));
                r.setState(rs.getString(8));
                r.setPoints(rs.getString(9));
               Register.add(r);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MasterDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return Register;
        
    }
    
     public List findCustomerById(String email)
    {    ArrayList<Register> addlist=new ArrayList<Register>();
        
        String sql="select * from customer where email like '%"+email+"%'";
        try {
            con = createConnection();
            ps=con.prepareStatement(sql);
          
            rs=ps.executeQuery();
            while(rs.next())
            {   Register m = new Register();
                System.out.println("test");
                m.setFname(rs.getString(1));
                m.setLname(rs.getString(2));
                m.setEmail(rs.getString(3));
                m.setPhone(rs.getString(4));
                m.setPassword(rs.getString(5));
                m.setAddress(rs.getString(6));
                m.setCity(rs.getString(7));
                m.setState(rs.getString(8));
                m.setPoints(rs.getString(9));
                addlist.add(m);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MasterDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return addlist;
    }

    
    
    public Register getCustomer(String email)
    {
        Register m = new Register();
        try {
            
            String sql="select * from customer where email = ?";
            con = createConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1,email);            
            rs=ps.executeQuery();
            while(rs.next()){
                m.setFname(rs.getString(1));
                m.setLname(rs.getString(2));
                m.setEmail(rs.getString(3));
                m.setPhone(rs.getString(4));
                m.setPassword(rs.getString(5));
                m.setAddress(rs.getString(6));
                m.setCity(rs.getString(7));
                m.setState(rs.getString(8));
                m.setPoints(rs.getString(9));

            }            
            
        } catch (SQLException ex) {
            Logger.getLogger(MasterDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return m;
        
    }
    
    
    public void updateCustomer(Register r){
        
        try {
            
            String sql = "update customer set fname = ? , lname = ?,address= ?,city=?,state=?  where email = ?";
            con = createConnection();
            ps= con.prepareStatement(sql);            
            ps.setString(1, r.getFname());
            ps.setString(2, r.getLname());
            ps.setString(3, r.getAddress());
            ps.setString(4, r.getCity());
            ps.setString(5, r.getState());
            ps.setString(6,r.getEmail());
           int count= ps.executeUpdate();

            
        } catch (SQLException ex) {
            Logger.getLogger(MasterDao.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    
    public void removeById(String email) throws SQLException{
        int i,j,k;
        try {
            
            
            String sql = "DELETE from products_donated where email=? ";
            String sql1="DELETE from customer where email=? ";
            String sql2="DELETE from products_purchased where email=? ";
            System.out.println(email);
            con = createConnection();
            
            ps= con.prepareStatement(sql);
            ps.setString(1,email);
            
            ps1=con.prepareStatement(sql1);
            ps1.setString(1,email);
           
            ps2=con.prepareStatement(sql2);
            ps2.setString(1,email);        
            
            i= ps.executeUpdate();
            j=ps1.executeUpdate();
            k=ps2.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MasterDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            ps.close();
            ps1.close();
            ps2.close();
            con.close();
        }
    }


    
    public int changePassword(Register r) 
{       int count=0;
String email= r.getEmail();
        String password=r.getPassword();
        try {
            con = createConnection(); 
            statement=con.createStatement();
           ps=con.prepareStatement("Update public.customer set password='"+password+"' where email='"+email+"'");
            int i= ps.executeUpdate();
          
          if (i != 0)
          {//Just to ensure data has been inserted into the database
         System.out.println("updated");
         count=1;
          }
              /*  String yo = "UPDATE customer SET password = ? WHERE email=?";
                ps = con.prepareStatement(yo);
               ps.setString(1,c.getPassword());
                ps.setString(2,c.getEmail());
                count = ps.executeUpdate();*/
        }    
         catch (SQLException ex) {
            Logger.getLogger(MasterDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    return count;
    }
} 
  