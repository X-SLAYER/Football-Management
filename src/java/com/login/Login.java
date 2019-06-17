
package com.login;

import com.actions.GetClubs;
import com.actions.GetFavourit;
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


public class Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un=request.getParameter("user");
		String pw=request.getParameter("pass");
                PrintWriter out=response.getWriter();
		
		request.getSession().invalidate();
		try {
		Class.forName("com.mysql.jdbc.Driver");
		 // loads driver
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/soccer", "root", ""); // gets a new connection
 
		PreparedStatement ps = c.prepareStatement("select * from soccer.users where user=? and pass=?");
		ps.setString(1, un);
		ps.setString(2, pw);
 
		ResultSet rs = ps.executeQuery();
 
		if (rs.next()) {
                    HttpSession httpSession = request.getSession();
                    user user = new user(rs.getString("user"),rs.getString("first"),rs.getString("last"),rs.getString("pass"),rs.getString("email"));
                    httpSession.setAttribute("user", rs.getString("user"));
                     httpSession.setAttribute("FullUser", user);
                    //----------
                    GetFavourit favourite = new GetFavourit(rs.getString("user"));
                    httpSession.setAttribute("fav", favourite.getFav());
                    //----------
                    GetClubs clubs = new GetClubs(rs.getString("user"));
                    httpSession.setAttribute("clubs", clubs.clubs);
                    //----------
                    response.sendRedirect("dashbord.jsp");
                        out.println("Username : "+rs.getString("user"));
			out.println("Password : "+rs.getString("pass"));
			return;
		}else{
                    out.println("NOT FOUND : ");
                }
		response.sendRedirect("login404.jsp");
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
                        out.println(e.getMessage());
		}
	}

}
