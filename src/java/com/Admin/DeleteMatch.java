package com.Admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteMatch extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String matchID = request.getParameter("matchID");

        PrintWriter out = response.getWriter();

        request.getSession().invalidate();
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/soccer", "root", ""); // gets a new connection

            PreparedStatement ps = c.prepareStatement("DELETE FROM soccer.matches WHERE (matchid = ?);");

            ps.setString(1, matchID);
 

            int rs = ps.executeUpdate();

            if (rs > 0) {
                out.print("Match Has Been Deleted Succesfully");
            }else  out.print("Cant Delete This Match !!!");
            
            response.setHeader("Refresh", "2; URL=DeleteMatch.jsp");
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }
}
