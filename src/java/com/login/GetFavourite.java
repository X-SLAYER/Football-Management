package com.login;

import com.Functions.GetName;
import com.actions.*;

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

public class GetFavourite extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        String user = (String) session.getAttribute("user");
        GetName Xslayer = new GetName();
        GetFavourit ff = new GetFavourit(user);

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/soccer", "root", ""); // gets a new connection

            PreparedStatement ps = c.prepareStatement("SELECT matchid,eq1,eq2,name , date, stade FROM soccer.clubs \n"
                    + "NATURAL JOIN soccer.matches\n"
                    + "JOIN soccer.favourite where soccer.clubs.id = soccer.favourite.ids\n"
                    + "and soccer.clubs.id = soccer.matches.eq1\n"
                    + "and soccer.favourite.user = '" + user + "';");

            ResultSet rs = ps.executeQuery();

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            out.print("<!DOCTYPE html>");
            out.print("<html lang='en'>");
            out.print("<head>");
            out.print("	<title>Favourite Matches</title>");
            out.print("	<meta charset='UTF-8'>");
            out.print("	<meta name='viewport' content='width=device-width, initial-scale=1'>");
            out.print("<!--===============================================================================================-->	");
            out.print("	<link rel='icon' type='image/png' href='images/icons/favicon.ico'/>");
            out.print("<!--===============================================================================================-->");
            out.print("	<link rel='stylesheet' type='text/css' href='vendor/bootstrap/css/bootstrap.min.css'>");
            out.print("<!--===============================================================================================-->");
            out.print("	<link rel='stylesheet' type='text/css' href='fonts/font-awesome-4.7.0/css/font-awesome.min.css'>");
            out.print("<!--===============================================================================================-->");
            out.print("	<link rel='stylesheet' type='text/css' href='vendor/animate/animate.css'>");
            out.print("<!--===============================================================================================-->");
            out.print("	<link rel='stylesheet' type='text/css' href='vendor/select2/select2.min.css'>");
            out.print("<!--===============================================================================================-->");
            out.print("	<link rel='stylesheet' type='text/css' href='vendor/perfect-scrollbar/perfect-scrollbar.css'>");
            out.print("<!--===============================================================================================-->");
            out.print("	<link rel='stylesheet' type='text/css' href='css/util.css'>");
            out.print("	<link rel='stylesheet' type='text/css' href='css/main.css'>");
            out.print("<!--===============================================================================================-->");
            out.print("</head>");
            out.print("<body>");
            out.print("	");
            out.print("	<div class='limiter'>");
            out.print("		<div class='container-table100'>");
            out.print("			<div class='wrap-table100'>");
            out.print("");
            out.print("					<center><h2>Favourite Clubs</h2></center>");

            out.print("				<div class='table100 ver3 m-b-110'>");
            out.print("					<div class='table100-head'>");
            out.print("						<table>");
            out.print("							<thead>");
            out.print("								<tr class='row100 head'>");
            out.print("									<th class='cell100 column1'>Home</th>");
            out.print("									<th class='cell100 column3'>Away</th>");
            out.print("									");
            out.print("									<th class='cell100 column5'>Date</th>");
            out.print("									<th class='cell100 column3'>Stadium</th>");
            out.print("								</tr>");
            out.print("							</thead>");
            out.print("						</table>");
            out.print("					</div>");
            out.print("");
            if (ff.getFav() == "") {
                out.print("					<center><h3 style='color:red;'>You Dont Have Favourit Clubs</h3></center>");
                out.print("					<center><a href='AddFavourite.jsp' style='color:yellow;'>Add Favourite</a></center>");
            }
            out.print("					<div class='table100-body js-pscroll'>");
            out.print("						<table>");
            out.print("							<tbody>");

            String path = "logos/";

            while (rs.next()) {
                out.print("<tr class='row100 body'>");
                out.print("									<td class='cell100 column1'>" + "<img alt=\"\" src=" + path + Xslayer.returnPath(rs.getString("eq1")) + " style=\"width:24px;height:24px\">" + "    " + Xslayer.returnName(rs.getString("eq1")) + "</td>");
                out.print("									<td class='cell100 column3'>" + "<img alt=\"\" src=" + path + Xslayer.returnPath(rs.getString("eq2")) + " style=\"width:24px;height:24px\">" + "    " + Xslayer.returnName(rs.getString("eq2")) + "</td>");
                out.print("									<td class='cell100 column5'>" + rs.getString("date") + "</td>");
                out.print("									<td class='cell100 column3'>" + rs.getString("stade") + "</td>");
                out.print("								</tr>");

            }

            out.print("</tbody>");
            out.print("						</table>");
            out.print("					</div>");
            out.print("				</div>");
            out.print("			</div>");
            out.print("		</div>");
            out.print("	</div>");
            out.print("");
            out.print("");
            out.print("<!--===============================================================================================-->	");
            out.print("	<script src='vendor/jquery/jquery-3.2.1.min.js'></script>");
            out.print("<!--===============================================================================================-->");
            out.print("	<script src='vendor/bootstrap/js/popper.js'></script>");
            out.print("	<script src='vendor/bootstrap/js/bootstrap.min.js'></script>");
            out.print("<!--===============================================================================================-->");
            out.print("	<script src='vendor/select2/select2.min.js'></script>");
            out.print("<!--===============================================================================================-->");
            out.print("	<script src='vendor/perfect-scrollbar/perfect-scrollbar.min.js'></script>");
            out.print("	<script>");
            out.print("		$('.js-pscroll').each(function(){");
            out.print("			var ps = new PerfectScrollbar(this);");
            out.print("");
            out.print("			$(window).on('resize', function(){");
            out.print("				ps.update();");
            out.print("			})");
            out.print("		});");
            out.print("			");
            out.print("		");
            out.print("	</script>");
            out.print("<!--===============================================================================================-->");
            out.print("	<script src='js/main.js'></script>");
            out.print("");
            out.print("</body>");
            out.print("</html>");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
