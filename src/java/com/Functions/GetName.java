
package com.Functions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetName {
    
    String name;
    public String returnName(String id)
    {
         try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/soccer", "root", ""); 
            PreparedStatement ps = c.prepareStatement("SELECT name from soccer.clubs WHERE soccer.clubs.id = "+id+" ;");
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
            name = rs.getString("name");
            }
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return name;
    }
    //-------------------------------------------
      public String returnPath(String id)
    {
         try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/soccer", "root", ""); 
            PreparedStatement ps = c.prepareStatement("SELECT path from soccer.clubs WHERE soccer.clubs.id = "+id+" ;");
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
            name = rs.getString("path");
            }
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return name;
    }
     //-------------------------------------------- 
        public String returnPoints(String id)
    {
         try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/soccer", "root", ""); 
            PreparedStatement ps = c.prepareStatement("SELECT pts from soccer.clubs WHERE soccer.clubs.id = "+id+" ;");
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
            name = rs.getString("pts");
            }
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return name;
    }
    
}
