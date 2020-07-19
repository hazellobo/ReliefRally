
package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register {
   
    String email;
    String fname;
    String lname;
    String password;
    String phone;
    String address;
    String state;
    String city;
    String points;


    

    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }
   
   
    
    public static Register populate(HttpServletRequest request, HttpServletResponse response){
        Register m = new Register();
        System.out.println(request.getParameter("email") );
        m.setFname(request.getParameter("fname"));
        m.setLname(request.getParameter("lname"));
        m.setEmail(request.getParameter("email"));
        m.setPhone(request.getParameter("phone"));
        m.setPassword(request.getParameter("password"));
        m.setAddress(request.getParameter("address"));
        m.setCity(request.getParameter("city"));
        m.setState(request.getParameter("state"));
       // m.setPoints(request.getParameter("points"));
        return m;
    }

   
   
}