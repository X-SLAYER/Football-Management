package com.actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetFavourit {

    private String fav="";

    public GetFavourit(String user) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // loads driver
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/soccer", "root", ""); // gets a new connection

            PreparedStatement ps = c.prepareStatement("select ids from soccer.favourite WHERE user = '"+user+"';");

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                this.fav += rs.getString("ids");
            }

            return;
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fav = e.getMessage();
        }
    }

    public String getFav() {
        return fav;
    }
}
