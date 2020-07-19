package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contactpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <script src=\"//platform-api.sharethis.com/js/sharethis.js#property=5bb796b6cc49680011f76cba&product=sticky-share-buttons\"></script>\n");
      out.write("         <link href=\"contactStyle.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        \n");
      out.write("        <title>Contact Us</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("    <body>\n");
      out.write("         ");
      out.print((request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage"));
      out.write(" \n");
      out.write("        <h2 style=\"font-family:  cursive; font-weight: 30px\">Come join us!!!!!</h2>\n");
      out.write("        <p style=\"font-family: cursive\"> Drop us a Message</p>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <div style=\"text-align:center\">\n");
      out.write("      <h2 style=\"font-family: cursive;font-weight: 30px\"><b>Contact Us</b></h2>\n");
      out.write("      <p style=\"font-family: cursive;font-weight: 20px\">Swing by for a cup of coffee, or leave us a message:</p>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"column\">\n");
      out.write("        <div id=\"map\" style=\"width:50%\">\n");
      out.write("            <iframe src=\"https://www.google.com/maps/d/embed?mid=1SPkR6SgLSx5aiS9Ua_w3mVpK77VEAOCs\" width=\"540\" height=\"480\"></iframe>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"column\">\n");
      out.write("        <form action=\"contactServlet\" method=\"post\">\n");
      out.write("            <label for=\"fname\" style=\"font-family: cursive\">First Name</label>\n");
      out.write("        <input type=\"text\" id=\"fname\" name=\"fname\" placeholder=\"Your name..\">\n");
      out.write("        <label for=\"lname\" style=\"font-family: cursive\" >Last Name</label>\n");
      out.write("        <input type=\"text\" id=\"lname\" name=\"lname\" placeholder=\"Your last name..\">\n");
      out.write("        <label for=\"email\" style=\"font-family: cursive\">Email Address</label> <br>\n");
      out.write("        <input type=\"text\" placeholder=\"Enter email\" name=\"email\" required><br>\n");
      out.write("        <label for=\"country\"  style=\"font-family: cursive\">Country</label>\n");
      out.write("        <input type=\"text\" name=\"country\" required><br>\n");
      out.write("        <label for=\"subject\" style=\"font-family: cursive\">Subject</label>\n");
      out.write("        <textarea id=\"subject\" name=\"subject\" placeholder=\"Write something..\" style=\"height:170px\"></textarea>\n");
      out.write("        <input type=\"submit\" value=\"Submit\">\n");
      out.write("        <div class=\"sharethis-inline-follow-buttons\"></div>\n");
      out.write("\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("       \n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
