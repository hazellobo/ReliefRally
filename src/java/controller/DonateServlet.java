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
import model.Donate;
import model.DonateDAO;

/**
 *
 * @author User
 */
public class DonateServlet extends HttpServlet {

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
                                    HttpSession session = request.getSession();

            String Category = (String) session.getAttribute("category");
            String Pname =   (String) session.getAttribute("product");
            String email = (String) session.getAttribute("email");
            String Pdesc= request.getParameter("desc");
            String usage = request.getParameter("usage");
            int new_points=0;
            
             switch(Category)
            {
                    case "elec": new_points= 100;
                    break;
                    case "clothes": new_points= 50;
                        break;
                    case "health": new_points= 40;
                    break;
                    case "books": new_points= 25;
                    break;
            }
             
        Donate donate = new Donate();
        
        donate.setCategory(Category);
        donate.setPname(Pname);
        donate.setEmail(email);
        donate.setPdesc(Pdesc);
        donate.setUsage(usage);
        donate.setNew_points(new_points);
        
        DonateDAO donateDAO = new DonateDAO();
        
        String userRegistered = donateDAO.userDonate(donate);
            switch (userRegistered) {
            //On success, you can display a message to user on Home page
                case "SUCCESS":
                    session.setAttribute("points",new_points) ;
                    request.getRequestDispatcher("/donsuccess.jsp").forward(request, response);
                    break;
                
                default:
                    request.setAttribute("errMessage", userRegistered);
                    request.getRequestDispatcher("/donate.jsp").forward(request, response);
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
