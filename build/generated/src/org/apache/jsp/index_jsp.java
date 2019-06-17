package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.login.user;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

    request.getSession().invalidate();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>Football scores and Results</title>\n");
      out.write("        <!-- Meta-Tags -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"keywords\"\n");
      out.write("              content=\"Key Login Form a Responsive Web Template, Bootstrap Web Templates, Flat Web Templates, Android Compatible Web Template, Smartphone Compatible Web Template, Free Webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design\">\n");
      out.write("        <script>\n");
      out.write("            addEventListener(\"load\", function () {\n");
      out.write("                setTimeout(hideURLbar, 0);\n");
      out.write("            }, false);\n");
      out.write("\n");
      out.write("            function hideURLbar() {\n");
      out.write("                window.scrollTo(0, 1);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <!-- //Meta-Tags -->\n");
      out.write("        <!-- Index-Page-CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\">\n");
      out.write("        <!-- //Custom-Stylesheet-Links -->\n");
      out.write("        <!--fonts -->\n");
      out.write("        <!-- //fonts -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" type=\"text/css\" media=\"all\">\n");
      out.write("        <!-- //Font-Awesome-File-Links -->\n");
      out.write("\n");
      out.write("        <!-- Google fonts -->\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Quattrocento+Sans:400,400i,700,700i\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Mukta:200,300,400,500,600,700,800\" rel=\"stylesheet\">\n");
      out.write("        <!-- Google fonts -->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <!-- //Head -->\n");
      out.write("    <!-- Body -->\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <section class=\"main\">\n");
      out.write("            <div class=\"layer\">\n");
      out.write("\n");
      out.write("                <div class=\"bottom-grid\">\n");
      out.write("                    <div class=\"logo\">\n");
      out.write("                        <h1> <a href=\"#\"><span class=\"fa fa-futbol-o\"></span> Football scores and Results</a></h1>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"links\">\n");
      out.write("                        <ul class=\"links-unordered-list\">\n");
      out.write("                            <li class=\"active\">\n");
      out.write("                                <a href=\"#\" class=\"\">Login</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"\">\n");
      out.write("                                <a href=\"#\" class=\"\">About Us</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"\">\n");
      out.write("                                <a href=\"register.jsp\" class=\"\">Register</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"\">\n");
      out.write("                                <a href=\"#\" clZass=\"\">Contact</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content-w3ls\">\n");
      out.write("                    <div class=\"text-center icon\">\n");
      out.write("                        <span class=\"fa fa-user-circle\"></span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content-bottom\">\n");
      out.write("                        <form action=\"Login\" method=\"POST\">\n");
      out.write("                            <div class=\"field-group\">\n");
      out.write("                                <span class=\"fa fa-user\" aria-hidden=\"true\"></span>\n");
      out.write("                                <div class=\"wthree-field\">\n");
      out.write("                                    <input name=\"user\" id=\"text1\" type=\"text\" value=\"\" placeholder=\"Username\" required>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"field-group\">\n");
      out.write("                                <span class=\"fa fa-lock\" aria-hidden=\"true\"></span>\n");
      out.write("                                <div class=\"wthree-field\">\n");
      out.write("                                    <input name=\"pass\" id=\"myInput\" type=\"Password\" placeholder=\"Password\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"wthree-field\">\n");
      out.write("                                <button type=\"submit\" class=\"btn\">Login</button>\n");
      out.write("                            </div>\n");
      out.write("                            <ul class=\"list-login\">\n");
      out.write("                                <li class=\"switch-agileits\">\n");
      out.write("                                    <label class=\"switch\">\n");
      out.write("                                        <input type=\"checkbox\">\n");
      out.write("                                        <span class=\"slider round\"></span>\n");
      out.write("                                        keep Logged in\n");
      out.write("                                    </label>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" class=\"text-right\">forgot password?</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"clearfix\"></li>\n");
      out.write("                            </ul>\n");
      out.write("                            <ul class=\"list-login-bottom\">\n");
      out.write("                                <li class=\"\">\n");
      out.write("                                    <a href=\"register.jsp\" class=\"\">Create Account</a>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                                <li class=\"clearfix\"></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <!-- //Body -->\n");
      out.write("\n");
      out.write("</html>");
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
