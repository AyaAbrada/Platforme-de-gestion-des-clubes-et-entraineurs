package org.example.Controller;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.example.Dao.UserRegisterDao;
import java.io.IOException;

@WebServlet("/UserRegisterServlet")
public class UserRegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("name");
        String email = request.getParameter("email");
        String mdps = request.getParameter("password");
        String role = request.getParameter("role");

        UserRegisterDao URD = new UserRegisterDao();

        int result = URD.registerUser(nom, email, mdps, role);

        if (result > 0) {
            response.getWriter().write("User successfully created");
            response.sendRedirect("index.jsp");
        } else {
            response.getWriter().write("Registration failed. Please try again.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("Inscription.jsp");
        dispatcher.forward(request, response);
    }
}
