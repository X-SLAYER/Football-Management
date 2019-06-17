package com.actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GetClubs {

    public static ArrayList<String> clubs = new ArrayList<>();
    public static ArrayList<String> allClubs = new ArrayList<>();

    public GetClubs(String user) {
        try {
            clubs.clear();
            Class.forName("com.mysql.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/soccer", "root", ""); // gets a new connection

            PreparedStatement ps = c.prepareStatement("SELECT name FROM soccer.clubs NATURAL JOIN soccer.favourite WHERE soccer.clubs.id = soccer.favourite.ids and soccer.favourite.user = '" + user + "';");
            
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                clubs.add(rs.getString("name"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}
