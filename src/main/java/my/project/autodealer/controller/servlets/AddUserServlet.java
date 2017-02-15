package my.project.autodealer.controller.servlets;

import my.project.autodealer.dao.repositories.UsersRepository;
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
        UsersRepository user = new UsersRepository(userName, password, email);
        service.addNewUser(user);
    }
}


