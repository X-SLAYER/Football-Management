package com.Functions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author X-SLAYER
 */
public class GetAll {

    public static ArrayList<String> allClubs = new ArrayList<>();

    public GetAll() {
        try {
            allClubs.clear();
            Class.forName("com.mysql.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/soccer", "root", "");

            PreparedStatement ps = c.prepareStatement("SELECT id from soccer.clubs;");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                allClubs.add(rs.getString("id"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
