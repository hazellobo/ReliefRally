package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script src='https://www.google.com/recaptcha/api.js'></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"login.css\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("\n");
      out.write(" </head>\n");
      out.write("\n");
      out.write("   <body>    \n");
      out.write("       \n");
      out.write("           <div class=\"container\">\n");
      out.write("        <img src=\"img3.png\" alt=\"Login\"/>\n");
      out.write("        <form action=\"LogServlet\" method=\"post\" autocomplete=\"off\">\n");
      out.write("                <div class=\"form_input\">\n");
      out.write("                    \n");
      out.write("                    <input type=\"text\" name=\"email\" placeholder=\"Enter Email\" required />\n");
      out.write("                </div>   \n");
      out.write("                \n");
      out.write("                <div class=\"form_input\">\n");
      out.write("                    \n");
      out.write("                    <input type=\"password\" name=\"password\" placeholder=\"Enter Password\" required />\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <button type=\"submit\" class=\"login_btn\">Login</button>\n");
      out.write("                \n");
      out.write("                <button type=\"reset\" class=\"cancel_btn\">Reset</button>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("        <br/>\n");
      out.write("            <a href=\"register.jsp\">New Member?Sign Up</a>\n");
      out.write("            <a href=\"forgot.jsp\">Forgot Password?</a>\n");
      out.write("           </div>\n");
      out.write("       <div class=\"wrapper\">\n");
      out.write("       <span style=\"color:red\">");
      out.print((request.getAttribute("errMessage") == null) ? ""
               + "" : request.getAttribute("errMessage"));
      out.write("</span>\n");
      out.write("          </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
