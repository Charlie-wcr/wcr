package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypackage.FindProductsDetails;

public final class ProductsPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      mypackage.FindProductsDetails findProductsDetails = null;
      synchronized (request) {
        findProductsDetails = (mypackage.FindProductsDetails) _jspx_page_context.getAttribute("findProductsDetails", PageContext.REQUEST_SCOPE);
        if (findProductsDetails == null){
          findProductsDetails = new mypackage.FindProductsDetails();
          _jspx_page_context.setAttribute("findProductsDetails", findProductsDetails, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Product Page</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            String number = request.getParameter("product_Number");
            String[] details = findProductsDetails.findDetails(number);
            String product_Number = details[0];
            String product_Name = details[1];
            String product_Image = details[2];
            String product_Price = details[3];
            String Remaining_Quantity = details[4];
        
      out.write("\n");
      out.write("\n");
      out.write("        <h1>\n");
      out.write("            <img src=\"");
      out.print( product_Image);
      out.write("\" alt=\"");
      out.print( product_Name);
      out.write("\" >\n");
      out.write("        </h1>\n");
      out.write("\n");
      out.write("        <p>\n");
      out.write("            Product_Number: ");
      out.print( product_Number);
      out.write("\n");
      out.write("        </p>\n");
      out.write("\n");
      out.write("        <p>\n");
      out.write("            Product_Name: ");
      out.print( product_Name);
      out.write("\n");
      out.write("        </p>\n");
      out.write("\n");
      out.write("        <p>\n");
      out.write("            Product_Price: ");
      out.print( product_Price);
      out.write("$\n");
      out.write("        </p>\n");
      out.write("\n");
      out.write("        <p>\n");
      out.write("            Remaining_Quantity: ");
      out.print( Remaining_Quantity);
      out.write("\n");
      out.write("        </p>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            var n = 1;\n");
      out.write("            function add() {\n");
      out.write("                n++;\n");
      out.write("                document.getElementById(\"Shopping_Quantity\").innerHTML = n;\n");
      out.write("            }\n");
      out.write("            function minus() {\n");
      out.write("                n--;\n");
      out.write("                document.getElementById(\"Shopping_Quantity\").innerHTML = n;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <p>\n");
      out.write("            Shopping_Quantity: \n");
      out.write("        </p>\n");
      out.write("\n");
      out.write("        <p>\n");
      out.write("            <button type=\"button\" onclick=\"add()\">+</button>\n");
      out.write("        </p>\n");
      out.write("\n");
      out.write("        <p id=\"Shopping_Quantity\">\n");
      out.write("            1\n");
      out.write("        </p>\n");
      out.write("\n");
      out.write("        <p>\n");
      out.write("            <button type=\"button\" onclick=\"minus()\">-</button>\n");
      out.write("        </p>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function addtoCart()\n");
      out.write("            {\n");
      out.write("                var xmlhttp;\n");
      out.write("                if (window.XMLHttpRequest)\n");
      out.write("                {\n");
      out.write("                    // IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码\n");
      out.write("                    xmlhttp = new XMLHttpRequest();\n");
      out.write("                } else\n");
      out.write("                {\n");
      out.write("                    // IE6, IE5 浏览器执行代码\n");
      out.write("                    xmlhttp = new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("                }\n");
      out.write("                xmlhttp.onreadystatechange = function ()\n");
      out.write("                {\n");
      out.write("                    if (xmlhttp.readyState == 4 && xmlhttp.status == 200)\n");
      out.write("                    {\n");
      out.write("                        document.getElementById(\"myDiv\").innerHTML = xmlhttp.responseText;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                xmlhttp.open(\"GET\", \"工作说明书范例.doc\", true);\n");
      out.write("                xmlhttp.send();\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        <p>\n");
      out.write("            <button type=\"button\" onclick=\"addtoCart()'\">Add to cart</button>\n");
      out.write("        </p>\n");
      out.write("        \n");
      out.write("        <div id=\"myDiv\">\n");
      out.write("            1\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
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
