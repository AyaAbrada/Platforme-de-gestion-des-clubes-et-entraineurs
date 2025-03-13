package org.example.Controller;
import org.example.Dao.SeanceDao;
import org.example.Model.Seance;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/SeanceServlet")
public class SeanceServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Récupérer les paramètres du formulaire
        String dateHeureString = request.getParameter("date");
        int idMembre = Integer.parseInt(request.getParameter("idMembre"));
        int idEntraineur = Integer.parseInt(request.getParameter("idEntraineur"));

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
            Date dateHeure = sdf.parse(dateHeureString);

            Seance seance = new Seance(idMembre, idEntraineur, dateHeure);

            SeanceDao seanceDao = new SeanceDao();
            int result = seanceDao.ajouterSeance(seance);

            // Vérifier si l'insertion a réussi
            if (result > 0) {
                response.sendRedirect("Dashboard.jsp");
            } else {
                request.setAttribute("message", "Erreur lors de la planification de la séance.");
                RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
                dispatcher.forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("message", "Erreur dans le format de la date ou d'autres champs.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
            dispatcher.forward(request, response);
        }
    }

    // Méthode doGet pour afficher la page de demande de séance
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Rediriger vers le formulaire de demande de séance (si nécessaire)
        RequestDispatcher dispatcher = request.getRequestDispatcher("demande_seance.jsp");
        dispatcher.forward(request, response);
    }
}
