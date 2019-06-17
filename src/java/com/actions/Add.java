package com.actions;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Add extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession ses = request.getSession(false);
        String user = (String) ses.getAttribute("user");
        PrintWriter out = response.getWriter();

        String[] favourites = request.getParameterValues("IsFav");
        
        List<String> list ;
        
        list = Arrays.asList(favourites);

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/soccer", "root", "");

            PreparedStatement delete = c.prepareStatement("DELETE FROM soccer.favourite WHERE (user = '" + user + "');");

            delete.executeUpdate();

            if (list != null) {
                for (String id : list) {

                    PreparedStatement ps = c.prepareStatement("INSERT INTO soccer.favourite (user, ids) VALUES ('" + user + "', '" + id + "');");
                    ps.executeUpdate();
                }
            }

            response.sendRedirect("dashbord.jsp");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
