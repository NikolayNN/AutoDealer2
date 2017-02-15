package my.project.autodealer.controller.servlets;

import my.project.autodealer.model.User;
import my.project.autodealer.services.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Nikol on 2/6/2017.
 */
public class SignInServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Service service = (Service) request.getServletContext().getAttribute("service");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        try {
            User user = service.loadUser(login);
            if (checkUserPassword(user, password)) {
                request.getSession().setAttribute("user", user);
                response.sendRedirect("secret/secret.jsp");
            } else {
                request.setAttribute("message", "check login or password");
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            request.setAttribute("message", ex.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }

    }

    private boolean checkUserPassword(User user, String password) {
        if (user.getPassword().equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}
