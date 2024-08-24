/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.82
 * Generated at: 2023-10-23 04:24:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addnewvendor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"ISO-8859-1\">\n");
      out.write("    <title>Client Register</title>\n");
      out.write("    <!-- Add Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write("        body {\n");
      out.write("            background-color: #f5f5f5;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            max-width: 600px;\n");
      out.write("            margin: 0 auto;\n");
      out.write("            padding: 20px;\n");
      out.write("            background-color: #fff;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            box-shadow: 0 0 5px rgba(0, 0, 0, 0.2);\n");
      out.write("        }\n");
      out.write("        h2 {\n");
      out.write("            font-size: 24px;\n");
      out.write("        }\n");
      out.write("        label {\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("	 <script>\n");
      out.write("        function toggleSubmit() {\n");
      out.write("            var registerButton = document.getElementById(\"register\");\n");
      out.write("            var termsCheckbox = document.getElementById(\"terms_conditions\");\n");
      out.write("\n");
      out.write("            if (termsCheckbox.checked) {\n");
      out.write("                registerButton.disabled = false;\n");
      out.write("            } else {\n");
      out.write("                registerButton.disabled = true;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2 class=\"text-center\">Vendor Registration Form</h2>\n");
      out.write("        <form action=\"registervendor\" method=\"post\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"name\">Vendor's Name:</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"name\" name=\"name\" required>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("         \n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"email\">Email:</label>\n");
      out.write("                <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\" required>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"phone\">Phone:</label>\n");
      out.write("                <input type=\"tel\" class=\"form-control\" id=\"phone\" name=\"phone\" required>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"address\">Address:</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"address\" name=\"address\" required>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label>Services Offered:</label>\n");
      out.write("                <div class=\"form-check\">\n");
      out.write("                    <input type=\"checkbox\" class=\"form-check-input\" id=\"catering\" name=\"services[]\" value=\"Catering\">\n");
      out.write("                    <label class=\"form-check-label\" for=\"catering\">Catering</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-check\">\n");
      out.write("                    <input type=\"checkbox\" class=\"form-check-input\" id=\"decoration\" name=\"services[]\" value=\"Decoration\">\n");
      out.write("                    <label class=\"form-check-label\" for=\"decoration\">Decoration</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-check\">\n");
      out.write("                    <input type=\"checkbox\" class=\"form-check-input\" id=\"venue\" name=\"services[]\" value=\"Venue Services\">\n");
      out.write("                    <label class=\"form-check-label\" for=\"venue\">Venue Services</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-check\">\n");
      out.write("                    <input type=\"checkbox\" class=\"form-check-input\" id=\"photography\" name=\"services[]\" value=\"Photography\">\n");
      out.write("                    <label class=\"form-check-label\" for=\"photography\">Photography</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-check\">\n");
      out.write("                    <input type=\"checkbox\" class=\"form-check-input\" id=\"entertainment\" name=\"services[]\" value=\"Entertainment\">\n");
      out.write("                    <label class=\"form-check-label\" for=\"entertainment\">Entertainment</label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"username\">Username:</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"username\" name=\"username\" required>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"password\">Password:</label>\n");
      out.write("                <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" required>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group form-check\">\n");
      out.write("                <input type=\"checkbox\" class=\"form-check-input\" id=\"terms_conditions\" name=\"terms_conditions\" onchange=\"toggleSubmit()\" required>\n");
      out.write("                <label class=\"form-check-label\" for=\"terms_conditions\">I Agree to the <a href=\"terms.jsp\" target=\"_blank\">Terms and Conditions</a></label>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary\" id=\"register\" disabled>Register</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("   \n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
