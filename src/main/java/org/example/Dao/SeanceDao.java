package org.example.Dao;
import org.example.Model.Seance;
import java.sql.*;

public class SeanceDao {

    public int ajouterSeance(Seance seance) {
        int result = 0;
        String query = "INSERT INTO seance (idMembre, idEntraineur, dateHeure) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setInt(1, seance.getIdMembre());
            ps.setInt(2, seance.getIdEntraineur());
            ps.setTimestamp(3, new Timestamp(seance.getDateHeur().getTime()));

            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
