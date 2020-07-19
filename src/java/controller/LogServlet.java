/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Login;
import model.LoginDAO;
import model.Register;

/**
 *
 * @author apple
 */
public class LogServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            
        Login login=new Login();
        login.setEmail(email); //setting the username and password through the loginBean object then only you can get it in future.
        login.setPassword(password);
        
        LoginDAO loginDao = new LoginDAO(); //creating object for LoginDao. This class contains main logic of the application.
        if(email.equals("admin@gmail.com")&& password.equals("0987654321")){
              request.getRequestDispatcher("/Admin.jsp").forward(request, response);
        }
        else
        {
        String userValidate = loginDao.authenticateUser(login); //Calling authenticateUser function
        
        if(userValidate.equals("Invalid user login")) //If function returns success string then user will be rooted to Home page
        {
            
           request.setAttribute("errMessage", userValidate); //If authenticateUser() function returnsother than SUCCESS string it will be sent to Login page again. Here the error message returned from function has been stored in a errMessage key.
            request.getRequestDispatcher("/login.jsp").forward(request, response);//forwarding the request
        }
        else
        {  HttpSession session=request.getSession();//creating a session
           // Date lastaccess=new Date(session.getLastAccessedTime());  
           // session.setAttribute("lastaccess",lastaccess);
            session.setAttribute("password",password);
            session.setAttribute("email", email);
            session.setAttribute("fname",userValidate); //with setAttribute() you can define a "key" and value pair so that you can get it in future using getAttribute("key")
            
            
            request.getRequestDispatcher("/LoggedIn.jsp").forward(request, response);//RequestDispatcher is used to send the control to the invoked page.
   }        
        }
        } catch (SQLException ex) {
        Logger.getLogger(LogServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
