package my.project.autodealer.controller.servlets;

import my.project.autodealer.dao.repositories.AdvertRepository;
import my.project.autodealer.services.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Nikol on 2/12/2017.
 */
public class ShowAdvertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Service service = (Service) request.getServletContext().getAttribute("service");
        List<AdvertRepository> adverts = (List<AdvertRepository>) service.getAdverts();
        request.setAttribute("adverts", adverts);
        request.getRequestDispatcher("main.jsp").forward(request, response);
    }
}
