package org.example.Dao;
import java.sql.*;

public class UserLoginDao {
    public boolean validateUser(String email, String mdps) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean var = false;

        try {
            conn = DatabaseConnection.getConnection();

            String query = "SELECT * FROM user WHERE email = ? AND mdps = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, mdps);
            rs = ps.executeQuery();
            if (rs.next()) {
                var= true;
            }
            return var;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return var;
    }
}
