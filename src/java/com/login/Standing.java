package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Standing extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/soccer", "root", ""); // gets a new connection

            PreparedStatement ps = c.prepareStatement("SELECT * FROM soccer.clubs order by W DESC;");

            ResultSet rs = ps.executeQuery();

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            HttpSession httpSession = request.getSession(false);
            String user = (String)httpSession.getAttribute("user");
            
            
            out.print("<title>"+user+"</title>");
            out.print("<link rel=\"stylesheet\" href=\"css/standing.css\" type=\"text/css\" media=\"all\">");
            out.print("<div class='ptable'>");
            out.print("  <h1 class='headin'>Classment 2018-2019</h1>");
            out.print("					<table>");
            out.print("						<tr class='col'>");
            out.print("							<th>#</th>");
            out.print("							<th></th>");
            out.print("							<th>Team</th>");
            out.print("							<th>GP</th>");
            out.print("							<th>W</th>");
            out.print("							<th>PTS</th>");
            out.print("						</tr>");
            
            int index = 0;
            String path = "logos/";
            while (rs.next()) {
               
                index+=1;
                if(index<19)
                {
                    out.print("<tr class='wpos'>");
                }else{
                    out.print("<tr class='pos'>");
                }
                out.print("<td>" + String.valueOf(index) + "</td>");
                out.print("<td>" +"<img alt=\"\" src="+path+rs.getString("path")+" style=\"width:24px;height:24px\">"+ "</td>");
                out.print("<td>" + rs.getString("name") + "</td>");
                out.print("<td>" + rs.getString("GP") + "</td>");
                out.print("<td>" + rs.getString("W") + "</td>");
                out.print("<td>" + rs.getString("PTS") + "</td>");
                out.print("</tr>");
            }
            out.print("					</table>");
            out.print("</div>");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}
