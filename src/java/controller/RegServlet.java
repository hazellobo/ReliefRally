/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.MasterDao;
import model.Register;
import model.RegisterDAO;

/**
 *
 * @author apple
 */
public class RegServlet extends HttpServlet {

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
            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
            String email = request.getParameter("email");
            String phone= request.getParameter("phone");
            String password = request.getParameter("password");
            String address = request.getParameter("address");
            String state= request.getParameter("state");
            String city = request.getParameter("city");
           


Register register = new Register();

register.setFname(fname);
register.setLname(lname);
register.setEmail(email);
register.setPhone(phone);
register.setPassword(password); 
register.setAddress(address);
register.setState(state);
register.setCity(city);

RegisterDAO registerDao = new RegisterDAO();
//insertion of user data in DB takes place
String userRegistered = registerDao.registerUser(register);
            switch (userRegistered) {
            //On success, you can display a message to user on Home page
                case "SUCCESS":
                   Register r= Register.populate(request, response);
                   request.setAttribute("Register", r);
                    MasterDao mmd=new MasterDao();
                     List<Register> Register = mmd.getAllCustomers();
                     request.setAttribute("Register",Register);
                     request.getRequestDispatcher("/Home.jsp").forward(request, response);
                    break;
                case "You are already registered. Sign-in!":
                    request.setAttribute("errMessage", userRegistered);
                    request.getRequestDispatcher("/login.jsp").forward(request, response);
                    break;
            //On Failure, display a meaningful message to the User.
                default:
                    request.setAttribute("errMessage", userRegistered);
                    request.getRequestDispatcher("/register.jsp").forward(request, response);
                    break;
            }
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
