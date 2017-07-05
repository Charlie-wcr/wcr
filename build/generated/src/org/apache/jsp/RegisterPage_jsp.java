package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegisterPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      mypackage.Judge judge = null;
      synchronized (request) {
        judge = (mypackage.Judge) _jspx_page_context.getAttribute("judge", PageContext.REQUEST_SCOPE);
        if (judge == null){
          judge = new mypackage.Judge();
          _jspx_page_context.setAttribute("judge", judge, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');
      mypackage.SaveintoDatabase saveintoDatabase = null;
      synchronized (request) {
        saveintoDatabase = (mypackage.SaveintoDatabase) _jspx_page_context.getAttribute("saveintoDatabase", PageContext.REQUEST_SCOPE);
        if (saveintoDatabase == null){
          saveintoDatabase = new mypackage.SaveintoDatabase();
          _jspx_page_context.setAttribute("saveintoDatabase", saveintoDatabase, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <form action=\"RegisterPage.jsp\" methd=\"post\">\n");
      out.write("            ");

                String username = request.getParameter("Username");
                String password = request.getParameter("Password");
                String password2 = request.getParameter("Password2");
                String realname = request.getParameter("Realname");
                String gender = request.getParameter("Gender");
                String birthday = request.getParameter("Year") + "." + request.getParameter("Month") + "." + request.getParameter("Day");

                int year, month, day;
            
      out.write("\n");
      out.write("            <h1>\n");
      out.write("                Register you own account!\n");
      out.write("            </h1>\n");
      out.write("            <p>\n");
      out.write("                Username:<input type='text' name ='Username'/><br>\n");
      out.write("                Password:<input type='password' name='Password'/><br>\n");
      out.write("                Confirm Password:<input type='password' name='Password2'/><br>\n");
      out.write("\n");
      out.write("                Realname:<input type=\"text\" name=\"Realname\"/><br>\n");
      out.write("\n");
      out.write("                Gender:\n");
      out.write("                <input type=\"radio\" name=\"Gender\" value=\"male\">Male\n");
      out.write("                <input type=\"radio\" name=\"Gender\" value=\"female\">Female<br>\n");
      out.write("\n");
      out.write("                Birthday:\n");
      out.write("                <select name=\"Year\">\n");
      out.write("                    ");

                        for (year = 2017; year >= 1920; year--) {
                    
      out.write("\n");
      out.write("                    <option value=");
      out.print( String.valueOf(year));
      out.write('>');
      out.write(' ');
      out.print( String.valueOf(year));
      out.write("</option>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </select>\n");
      out.write("\n");
      out.write("                <select name=\"Month\">\n");
      out.write("                    ");

                        for (month = 1; month <= 12; month++) {
                    
      out.write("\n");
      out.write("                    <option value=");
      out.print( String.valueOf(month));
      out.write('>');
      out.write(' ');
      out.print( String.valueOf(month));
      out.write("</option>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </select>\n");
      out.write("\n");
      out.write("                <select name=\"Day\">\n");
      out.write("                    ");

                        for (day = 1; day <= 31; day++) {
                    
      out.write("\n");
      out.write("                    <option value=");
      out.print( String.valueOf(day));
      out.write('>');
      out.write(' ');
      out.print( String.valueOf(day));
      out.write("</option>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </select><br>\n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"Finish\">\n");
      out.write("            </p>\n");
      out.write("            ");

                if (username != null && password != null) {
                    if (judge.judgeUsername(username)) {
            
      out.write("\n");
      out.write("            <p>\n");
      out.write("                The username has already been registered!\n");
      out.write("            </p>\n");
      out.write("            ");

            } else {
                if (password.equals(password2)) {
                    saveintoDatabase.Save(username, password, realname, gender, birthday);
                } else {
            
      out.write("\n");
      out.write("            <p>\n");
      out.write("                The passwords you entered must be the same!\n");
      out.write("            </p>\n");
      out.write("            ");

                    }
                }
            } else {
            
      out.write("\n");
      out.write("            <p>\n");
      out.write("                Please enter your username and password!\n");
      out.write("            </p>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </form>\n");
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
