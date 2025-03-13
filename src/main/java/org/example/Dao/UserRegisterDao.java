package org.example.Dao;

import java.sql.*;

public class UserRegisterDao {
    public int registerUser(String nom, String email, String mdps, String role) {
        Connection conn = null;
        PreparedStatement psUser = null;
        int isRegistered = 0;

        try {
            conn = DatabaseConnection.getConnection();


            String userQuery = "INSERT INTO user (nom, email, mdps, role) VALUES (?, ?, ?, ?)";
            psUser = conn.prepareStatement(userQuery, Statement.RETURN_GENERATED_KEYS);
            psUser.setString(1, nom);
            psUser.setString(2, email);
            psUser.setString(3, mdps);
            psUser.setString(4, role);

            isRegistered = psUser.executeUpdate();

            ResultSet generatedKeys = psUser.getGeneratedKeys();
            if (generatedKeys.next()) {
                 long userId = generatedKeys.getLong(1);
                 System.out.println("Generated User ID: " + userId);
             }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (psUser != null) psUser.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return isRegistered;
    }


}
