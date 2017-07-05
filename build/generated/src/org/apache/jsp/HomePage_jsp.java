package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Home Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String username = request.getParameter("Username");
        
      out.write("\n");
      out.write("        <h1>\n");
      out.write("            Hello ");
      out.print( username);
      out.write(",<br> \n");
      out.write("            Welcome to Sugery_y!\n");
      out.write("        </h1> \n");
      out.write("        <p>\n");
      out.write("            <a href=\"ProductsPage.jsp?product_Number=00001\" >\n");
      out.write("            <img src=\"Product1.webp.jpg\" alt=\"Product1\">\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <a href=\"ProductsPage.jsp?product_Number=00002\">\n");
      out.write("            <img src=\"Product2.webp.jpg\" alt=\"Product2\">\n");
      out.write("            </a>\n");
      out.write("        </p>\n");
      out.write("        <p>\n");
      out.write("            <a href=\"ProductsPage.jsp?product_Number=00003\">\n");
      out.write("            <img src=\"Product3.webp.jpg\" alt=\"Product3\">\n");
      out.write("            </a>\n");
      out.write("        </p>\n");
      out.write("        <p>\n");
      out.write("            <a href=\"ProductsPage.jsp?product_Number=00004\">\n");
      out.write("            <img src=\"Product4.webp.jpg\" alt=\"Product4\">\n");
      out.write("            </a>\n");
      out.write("        </p>\n");
      out.write("        <p>\n");
      out.write("            <a href=\"ProductsPage.jsp?product_Number=00005\">\n");
      out.write("            <img src=\"Product5.webp.jpg\" alt=\"Product5\">\n");
      out.write("            </a>\n");
      out.write("        </p>\n");
      out.write("        <p>\n");
      out.write("            <a href=\"ProductsPage.jsp?product_Number=00006\">\n");
      out.write("            <img src=\"Product6.webp.jpg\" alt=\"Product6\">\n");
      out.write("            </a>\n");
      out.write("        </p>\n");
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
