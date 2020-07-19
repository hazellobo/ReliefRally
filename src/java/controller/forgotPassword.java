/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ejb.MailSenderBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.MasterDao;
import model.Register;

/**
 *
 * @author User
 */
public class forgotPassword extends HttpServlet {

    @EJB
    private MailSenderBean mailSender;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {   
         response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String email = request.getParameter("email");
            Register r= new Register();
           // Random r=new Random();
            int n= (int) (143678 + Math.random() * 9000);
            String otp = Integer.toString(n) ;
            r.setEmail(email);
             //generates otp
            r.setPassword(otp);
            MasterDao fdao =new MasterDao();
            fdao.forgot(r);
       
        String toEmail = request.getParameter("email");
        String subject = "Forgot Password";
        String message = "Your temporary password is" + otp + "\n "+"http://localhost:8080/MyProject/login.jsp";

        String fromEmail = "1809Hazel@gmail.com";
        String username = "1809Hazel@gmail.com";
        String pass = "123Hazel";
        mailSender.sendEmail(fromEmail, username, pass, toEmail, subject, message);
            
            request.getRequestDispatcher("/newjsp.jsp").forward(request, response);

            
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
