package org.example.Dao;

import java.sql.*;

public class UserLoginDao {

    // Vérifie si l'utilisateur existe dans la base de données
    public boolean checkLogin(String email, String mdps) {
        String query = "SELECT * FROM user WHERE email = ? AND mdps = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, email);
            ps.setString(2, mdps);
            ResultSet rs = ps.executeQuery();

            // Si un utilisateur est trouvé avec ces informations de connexion, renvoyer vrai
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Retourne false en cas d'erreur
        }
    }
}
