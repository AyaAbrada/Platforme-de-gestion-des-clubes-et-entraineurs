package org.example.Controller;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.example.Dao.DatabaseConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String mdps = request.getParameter("mdps");

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Etablir la connexion à la base de données
            conn = DatabaseConnection.getConnection();

            // Vérifier les informations d'identification de l'utilisateur
            String query = "SELECT * FROM user WHERE email = ? AND mdps = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, mdps);

            rs = ps.executeQuery();

            if (rs.next()) {
                // L'utilisateur est connecté, créer une session
                HttpSession session = request.getSession();
                session.setAttribute("userId", rs.getInt("id"));
                session.setAttribute("nom", rs.getString("nom"));
                session.setAttribute("email", rs.getString("email"));

                // Rediriger vers la page d'accueil du patient
                response.sendRedirect("Dashboard.jsp");
            } else {
                // Informations incorrectes, rediriger vers la page d'erreur
                response.sendRedirect("error.jsp");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // La méthode doGet permet d'afficher la page de connexion (formulaire)
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Rediriger vers la page de login (formulaire)
        // Vous pouvez rediriger vers une page JSP contenant le formulaire de connexion
        RequestDispatcher dispatcher = request.getRequestDispatcher("");
        dispatcher.forward(request, response);
    }
}

