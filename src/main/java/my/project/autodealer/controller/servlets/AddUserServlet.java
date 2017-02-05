package my.project.autodealer.controller.servlets;

import my.project.autodealer.model.User;
import my.project.autodealer.services.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Nikol on 2/4/2017.
 */
public class AddUserServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        Service service = (Service) request.getServletContext().getAttribute("service");
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        User user = new User(userName, password, email);
        service.addNewUser(user);
    }
}


