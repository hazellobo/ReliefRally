
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ejb.MailSenderBean;
import model.Register;
import model.RegisterDAO;


public class RegServlet extends HttpServlet {

    @EJB
    private MailSenderBean mailSender;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
            String email = request.getParameter("email");
            String phone= request.getParameter("phone");
            String password = request.getParameter("password");
            String address = request.getParameter("address");
            String state= request.getParameter("state");
            String city = request.getParameter("city"); 
           
            //mail
    /*    String toEmail = request.getParameter("email");
        String subject = "Registration Successful";
        String message = "Dear User, "
                + " \r\n"
                + "Thankyou for registering to our site       "
                + " \r\n"
                + "http://localhost:8080/MyProject/Home.jsp";
        
       
        String fromEmail = "1809Hazel@gmail.com";
        String username = "1809Hazel@gmail.com";
        String pass = "123Hazel";
        
            
            mailSender.sendEmail(fromEmail, username, pass, toEmail, subject, message);*/
try (PrintWriter out = response.getWriter()) {
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
                  // mailSender.sendEmail(fromEmail, username, pass, toEmail, subject, message);
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
