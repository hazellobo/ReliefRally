package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register</title>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://www.google.com/recaptcha/api.js\" async defer></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"http://gc.kis.v2.scr.kaspersky-labs.com/E462864B-38E8-014E-9639-3082B49E1594/main.js\" charset=\"UTF-8\"></script><script type=\"text/javascript\" src=\"jquery.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"registerStyle.css\">\n");
      out.write("    </head>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("         <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">DonationSite</a>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("      <li class=\"active\"><a href=\"homepage.jsp\">Home</a></li>\n");
      out.write("      <li><a href=\"contactpage.jsp\">Contact Us</a></li>\n");
      out.write("      <li><a href=\"#\">About Us</a></li>\n");
      out.write("\n");
      out.write("    </ul>\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("      <li><a href=\"register.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("      <li><a href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write(" \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("    <body>\n");
      out.write("        ");
      out.print((request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage"));
      out.write("\n");
      out.write("\n");
      out.write("         <div id=\"wrapper\">     \n");
      out.write("             <h1>Register</h1>\n");
      out.write("             <p>Please fill in this form to create an account.</p>\n");
      out.write("             <hr>\n");
      out.write("             <form action=\"RegServlet\" method=\"post\" onsubmit=\"return checkform(this);\" class=\"formmargin\">\n");
      out.write("                \n");
      out.write("                 <div class=\"form-element\">\n");
      out.write("                <label for=\"Fname\">First Name</label>  \n");
      out.write("                <input type=\"text\" name=\"fname\" id=\"fname\" required>\n");
      out.write("            </div>\n");
      out.write("                  <div class=\"form-element\">\n");
      out.write("                <label for=\"Lname\">Last Name</label>  \n");
      out.write("                <input type=\"text\" name=\"lname\" id=\"lname\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-element\">\n");
      out.write("                <label for=\"email\">Email</label>  \n");
      out.write("                <input type=\"email\" name=\"email\" id=\"email\" placeholder = \"johnDoe@gmail.com\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("                \n");
      out.write("            <div class=\"form-element\">\n");
      out.write("                <label for=\"phone\">Telephone</label>\n");
      out.write("                <input type=\"text\" name=\"phone\" id=\"phone\" placeholder = \"9876543210\" pattern=\"[789][0-9]{9}\" title=\"Enter valid phone no.\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-element\">\n");
      out.write("                <label for=\"password\">Password</label>\n");
      out.write("                <input type=\"password\" name=\"password\" id=\"password\"  pattern=\".{6,}\" title=\"Password Strength: Weak\" onkeyup=\"validatePassword(this.value);\"/><span id=\"msg\"></span>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-element\">\n");
      out.write("                <label for=\"passwordConfirm\">Confirm Password</label>\n");
      out.write("                <input type=\"password\" name=\"passwordConfirm\" id=\"passwordConfirm\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"form-element\">\n");
      out.write("\t\t\t\t<label for=\"address\">Address</label>\n");
      out.write("                                <input type=\"text\" name=\"address\" id=\"address\" placeholder=\"Enter address\" required>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("                \t<div class=\"form-element\">\n");
      out.write("\t\t<label for=\"state\">State</label>\n");
      out.write("                <input type=\"text\" name=\"state\" id=\"state\" placeholder=\"Enter State\" required>\n");
      out.write("\t\t\t</div>\n");
      out.write("            \n");
      out.write("\n");
      out.write("\t\t\t<div class=\"form-element\">\n");
      out.write("\t\t\t\t<label for=\"city\">City</label>\n");
      out.write("                                <input type=\"text\" name=\"city\" id=\"city1\" placeholder=\"Enter City\" required>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("                <hr>\n");
      out.write("                <p>By creating an account you agree to our <a href=\"#\">Terms & Privacy</a>.</p>\n");
      out.write("    <!-- START CAPTCHA -->\n");
      out.write("<br>\n");
      out.write("<div class=\"capbox\">\n");
      out.write("\n");
      out.write("<div id=\"CaptchaDiv\"></div>\n");
      out.write("\n");
      out.write("<div class=\"capbox-inner\">\n");
      out.write("Type the above number:<br>\n");
      out.write("\n");
      out.write("<input type=\"hidden\" id=\"txtCaptcha\">\n");
      out.write("<input type=\"text\" name=\"CaptchaInput\" id=\"CaptchaInput\" size=\"15\"><br>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<br><br>\n");
      out.write("<!-- END CAPTCHA -->\n");
      out.write("\n");
      out.write("                <div class=\"form-element\">\n");
      out.write("                       <input type=\"submit\" id=\"submitButton\" value=\"Sign Up\">\n");
      out.write("                 </div>\n");
      out.write("                \n");
      out.write("               <div class=\"container signin\">\n");
      out.write("                <p>Already have an account? <a href=\"login.jsp\">Sign in</a>.</p>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("// Captcha Script\n");
      out.write("function checkform(theform){\n");
      out.write("var why = \"\";\n");
      out.write("\n");
      out.write("if(theform.CaptchaInput.value == \"\"){\n");
      out.write("why += \"- Please Enter CAPTCHA Code.\\n\";\n");
      out.write("}\n");
      out.write("if(theform.CaptchaInput.value != \"\"){\n");
      out.write("if(ValidCaptcha(theform.CaptchaInput.value) == false){\n");
      out.write("why += \"- The CAPTCHA Code Does Not Match.\\n\";\n");
      out.write("}\n");
      out.write("}\n");
      out.write("if(why != \"\"){\n");
      out.write("alert(why);\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("\n");
      out.write("var a = Math.ceil(Math.random() * 9)+ '';\n");
      out.write("var b = Math.ceil(Math.random() * 9)+ '';\n");
      out.write("var c = Math.ceil(Math.random() * 9)+ '';\n");
      out.write("var d = Math.ceil(Math.random() * 9)+ '';\n");
      out.write("var e = Math.ceil(Math.random() * 9)+ '';\n");
      out.write("\n");
      out.write("var code = a + b + c + d + e;\n");
      out.write("document.getElementById(\"txtCaptcha\").value = code;\n");
      out.write("document.getElementById(\"CaptchaDiv\").innerHTML = code;\n");
      out.write("\n");
      out.write("// Validate input against the generated number\n");
      out.write("function ValidCaptcha(){\n");
      out.write("var str1 = removeSpaces(document.getElementById('txtCaptcha').value);\n");
      out.write("var str2 = removeSpaces(document.getElementById('CaptchaInput').value);\n");
      out.write("if (str1 == str2){\n");
      out.write("return true;\n");
      out.write("}else{\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("\n");
      out.write("// Remove the spaces from the entered and generated code\n");
      out.write("function removeSpaces(string){\n");
      out.write("return string.split(' ').join('');\n");
      out.write("}\n");
      out.write("\n");
      out.write("var password = document.getElementById(\"password\")\n");
      out.write("  , passwordConfirm = document.getElementById(\"passwordConfirm\");\n");
      out.write("\n");
      out.write("function validatePassword(){\n");
      out.write("  if(password.value !== passwordConfirm.value) {\n");
      out.write("    passwordConfirm.setCustomValidity(\"Passwords Don't Match\");\n");
      out.write("  } else {\n");
      out.write("    passwordConfirm.setCustomValidity('');\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("password.onchange = validatePassword;\n");
      out.write("passwordConfirm.onkeyup = validatePassword;\n");
      out.write("\n");
      out.write("</script>\n");
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
