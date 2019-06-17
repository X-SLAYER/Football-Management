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

public class AddMatch extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String matchID = request.getParameter("matchID");
        String eq1 = request.getParameter("eq1");
        String eq2 = request.getParameter("eq2");
        String date = request.getParameter("date");
        String stade = request.getParameter("stade");

        PrintWriter out = response.getWriter();

        request.getSession().invalidate();
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/soccer", "root", ""); // gets a new connection

            PreparedStatement ps = c.prepareStatement("INSERT INTO soccer.matches (matchid, eq1, eq2, date, stade) VALUES (?, ?, ?, ?, ?);");

            ps.setString(1, matchID);
            ps.setString(2, eq1);
            ps.setString(3, eq2);
            ps.setString(4, date);
            ps.setString(5, stade);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                out.print("Match Has Been Added Succesfully");
            }else  out.print("Cant Added This Match !!!");
            
            response.setHeader("Refresh", "2; URL=AddMatch.jsp");
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }
}
