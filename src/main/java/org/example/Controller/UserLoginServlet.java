package org.example.Controller;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.example.Dao.UserLoginDao;
import java.io.IOException;

@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String mdps = request.getParameter("password");

        UserLoginDao loginDao = new UserLoginDao();

        boolean isValidUser = loginDao.checkLogin(email, mdps);

        if (isValidUser) {

            HttpSession session = request.getSession();
            session.setAttribute("email", email);
            response.sendRedirect("Dashboard.jsp");
        } else {
            response.sendRedirect("LoginError.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("Connexion.jsp");
        dispatcher.forward(request, response);
    }
}
