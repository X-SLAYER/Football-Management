package com.login;

import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Register extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String n = request.getParameter("user");
        String p = request.getParameter("pass");
        String first = request.getParameter("first");
        String last = request.getParameter("last");
        String email = request.getParameter("email");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/soccer", "root", "");

            PreparedStatement ps = con.prepareStatement(
                    "insert into soccer.users values(?,?,?,?,?)");

            ps.setString(1, n);
            ps.setString(2, p);
            ps.setString(3, first);
            ps.setString(4, last);
            ps.setString(5, email);

            int i = ps.executeUpdate();
            if (i == 1) {
                out.print("You are successfully registered...You Are Being redirected to home page");
                response.setHeader("Refresh", "1; URL=index.jsp");
                return;
            } else {
                out.print("Error in registration !!");
                response.setHeader("Refresh", "2; URL=index.jsp");
            }
        } catch (Exception e2) {
            System.out.println(e2.getMessage());
        }

        out.close();
    }

}
