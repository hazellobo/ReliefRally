/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.MasterDao;
import model.Register;

/**
 *
 * @author User
 */
public class ChangePasswordServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           HttpSession session= request.getSession();
            String email = (String)session.getAttribute("email");
            String cpass= (String)session.getAttribute("password");
            System.out.println("password:" + cpass);
            String oldpassword = request.getParameter("oldpassword");
            String newpassword = request.getParameter("newpassword");
            if(cpass == null ? oldpassword == null : cpass.equals(oldpassword)){
                Register c = new Register();
            c.setEmail(email);
            c.setPassword(newpassword);
             MasterDao cdao = new MasterDao();
            int count=cdao.changePassword(c); //updates DB
            if(count>0){
                System.out.println("Successfully Changed the Password");               
                response.sendRedirect("LoggedIn.jsp");               
            }
            else{
                request.setAttribute("errMessage","Oops.. something went wrong");
                request.getRequestDispatcher("ChangePassword.jsp").forward(request, response);
            }
            }else{
               request.setAttribute("errMessage","Incorrect Password");
                request.getRequestDispatcher("ChangePassword.jsp").forward(request, response);
   
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
